package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dao.AdminDao;
import com.youzhi.dao.AdminPermissionRelationDao;
import com.youzhi.dao.AdminRoleRelationDao;
import com.youzhi.dto.AdminParam;
import com.youzhi.dto.AdminQueryParam;
import com.youzhi.dto.AdminVo;
import com.youzhi.mapper.AdminLoginLogMapper;
import com.youzhi.mapper.AdminMapper;
import com.youzhi.mapper.AdminPermissionRelationMapper;
import com.youzhi.mapper.AdminRoleRelationMapper;
import com.youzhi.model.*;
import com.youzhi.service.AdminService;
import com.youzhi.util.JwtTokenUtil;
import com.youzhi.util.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cwj
 * @date 2020/1/3 14:56
 */
@Service
public class AdminServiceImpl implements AdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminServiceImpl.class);
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private AdminLoginLogMapper adminLoginLogMapper;
    @Autowired
    private AdminRoleRelationDao adminRoleRelationDao;
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private AdminRoleRelationMapper adminRoleRelationMapper;
    @Autowired
    private AdminPermissionRelationMapper adminPermissionRelationMapper;
    @Autowired
    private AdminPermissionRelationDao adminPermissionRelationDao;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public AdminVo getAdminByUsername(String username) {
        List<AdminVo> adminList = adminDao.getAdminList(username);
        if(adminList != null && adminList.size() > 0){
            return adminList.get(0);
        }
        return null;
    }

    @Override
    public List<Permission> getPermissionList(Integer id) {
        return adminRoleRelationDao.getPermissionList(id);
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        //密码需要客户端加密后传递
        try{
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if(!passwordEncoder.matches(password,userDetails.getPassword())){
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
            updateLoginTimeByUsername(username);
            insertLoginLog(username);
        } catch (AuthenticationException e){
            LOGGER.warn("登录异常：{}",e.getMessage());
        }
        return token;
    }

    @Override
    public int add(AdminParam adminParam) {
        Admin currentAdmin = SecurityUtils.getAdmin();
        Admin admin = new Admin();
        BeanUtils.copyProperties(adminParam,admin);
        admin.setCreateTime(new Date());
        admin.setStatus(1);
        admin.setCreateAdminId(currentAdmin.getId());
        //查询是否有相同的用户名
        AdminExample example = new AdminExample();
        example.createCriteria().andUsernameEqualTo(admin.getUsername());
        List<Admin> adminList = adminMapper.selectByExample(example);
        if(adminList.size() > 0){
            return 0;
        }
        //将密码进行加密操作
        String md5Password = passwordEncoder.encode(admin.getPassword());
        admin.setPassword(md5Password);
        return adminMapper.insert(admin);
    }

    @Override
    public List<AdminVo> listPage(AdminQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return adminDao.list(queryParam);
    }

    @Override
    public int update(Integer id, AdminParam adminParam) {
        Admin currentAdmin = SecurityUtils.getAdmin();
        Admin admin = new Admin();
        BeanUtils.copyProperties(adminParam,admin);
        admin.setId(id);
        admin.setUpdateAdminId(currentAdmin.getId());
        admin.setUdpateTime(new Date());

        /*更新商品*/
        AdminExample example = new AdminExample();
        example.createCriteria().andIdEqualTo(id);
        return adminMapper.updateByExampleSelective(admin,example);
    }

    @Override
    public int delete(Integer id) {
        return adminMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int forbidden(Integer id) {
        return adminMapper.updateByPrimaryKeySelective(new Admin().setId(id).setStatus(1));
    }

    @Override
    public int launch(Integer id) {
        return adminMapper.updateByPrimaryKeySelective(new Admin().setId(id).setStatus(0));
    }

    @Override
    public int updateRole(Integer adminId, List<Integer> roleIds) {
        int count = roleIds == null ? 0 : roleIds.size();
        //先删除原来的关系
        AdminRoleRelationExample adminRoleRelationExample = new AdminRoleRelationExample();
        adminRoleRelationExample.createCriteria().andAdminIdEqualTo(adminId);
        adminRoleRelationMapper.deleteByExample(adminRoleRelationExample);
        //建立新关系
        if (!CollectionUtils.isEmpty(roleIds)) {
            List<AdminRoleRelation> list = new ArrayList<>();
            for (Integer roleId : roleIds) {
                AdminRoleRelation roleRelation = new AdminRoleRelation();
                roleRelation.setAdminId(adminId);
                roleRelation.setRoleId(roleId);
                list.add(roleRelation);
            }
            adminRoleRelationDao.addBatch(list);
        }
        return count;
    }

    @Override
    public List<Role> getRoleList(Integer adminId) {
        return adminRoleRelationDao.getRoleList(adminId);
    }

    @Override
    public int updatePermission(Integer adminId, List<Integer> permissionIds) {
        //删除原所有权限关系
        AdminPermissionRelationExample relationExample = new AdminPermissionRelationExample();
        relationExample.createCriteria().andAdminIdEqualTo(adminId);
        adminPermissionRelationMapper.deleteByExample(relationExample);
        //获取用户所有角色权限
        List<Permission> permissionList = adminRoleRelationDao.getRolePermissionList(adminId);
        List<Integer> rolePermissionList = permissionList.stream().map(Permission::getId).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(permissionIds)) {
            List<AdminPermissionRelation> relationList = new ArrayList<>();
            //筛选出+权限
            List<Integer> addPermissionIdList = permissionIds.stream().filter(permissionId -> !rolePermissionList.contains(permissionId)).collect(Collectors.toList());
            //筛选出-权限
            List<Integer> subPermissionIdList = rolePermissionList.stream().filter(permissionId -> !permissionIds.contains(permissionId)).collect(Collectors.toList());
            //插入+-权限关系
            relationList.addAll(convert(adminId,1,addPermissionIdList));
            relationList.addAll(convert(adminId,-1,subPermissionIdList));
            return adminPermissionRelationDao.addBatch(relationList);
        }
        return 0;
    }

    /**
     * 将+-权限关系转化为对象
     */
    private List<AdminPermissionRelation> convert(Integer adminId,Integer type,List<Integer> permissionIdList) {
        List<AdminPermissionRelation> relationList = permissionIdList.stream().map(permissionId -> {
            AdminPermissionRelation relation = new AdminPermissionRelation();
            relation.setAdminId(adminId);
            relation.setType(type);
            relation.setPermissionId(permissionId);
            return relation;
        }).collect(Collectors.toList());
        return relationList;
    }

    /**
     * 添加登录记录
     * @param username 用户名
     */
    private void insertLoginLog(String username){
        Admin admin = getAdminByUsername(username);
        AdminLoginLog loginLog = new AdminLoginLog();
        loginLog.setAdminId(admin.getId());
        loginLog.setCreateTime(new Date());
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        loginLog.setIp(request.getRemoteAddr());
        adminLoginLogMapper.insert(loginLog);
    }

    /**
     * 根据用户名修改登录时间
     */
    private void updateLoginTimeByUsername(String username){
        Admin record = new Admin();
        record.setLoginTime(new Date());
        AdminExample example = new AdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        adminMapper.updateByExampleSelective(record,example);
    }
}
