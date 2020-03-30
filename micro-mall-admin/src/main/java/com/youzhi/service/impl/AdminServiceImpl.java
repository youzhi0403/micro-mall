package com.youzhi.service.impl;

import com.youzhi.dao.AdminDao;
import com.youzhi.dao.AdminRoleRelationDao;
import com.youzhi.dto.AdminParam;
import com.youzhi.dto.AdminVo;
import com.youzhi.mapper.AdminLoginLogMapper;
import com.youzhi.mapper.AdminMapper;
import com.youzhi.model.*;
import com.youzhi.service.AdminService;
import com.youzhi.util.JwtTokenUtil;
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
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

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
    public Admin register(AdminParam adminParam) {
        Admin admin = new Admin();
        BeanUtils.copyProperties(adminParam,admin);
        admin.setCreateTime(new Date());
        admin.setStatus(1);
        //查询是否有相同的用户名
        AdminExample example = new AdminExample();
        example.createCriteria().andUsernameEqualTo(admin.getUsername());
        List<Admin> adminList = adminMapper.selectByExample(example);
        if(adminList.size() > 0){
            return null;
        }
        //将密码进行加密操作
        String md5Password = passwordEncoder.encode(admin.getPassword());
        admin.setPassword(md5Password);
        adminMapper.insert(admin);
        return admin;
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
