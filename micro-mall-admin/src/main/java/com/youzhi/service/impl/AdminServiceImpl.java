package com.youzhi.service.impl;

import com.youzhi.dao.AdminRoleRelationDao;
import com.youzhi.mapper.AdminMapper;
import com.youzhi.model.Admin;
import com.youzhi.model.AdminExample;
import com.youzhi.model.AdminRoleRelation;
import com.youzhi.model.Permission;
import com.youzhi.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/3 14:56
 */
@Service
public class AdminServiceImpl implements AdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminServiceImpl.class);

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AdminRoleRelationDao adminRoleRelationDao;

    @Override
    public Admin getAdminByUsername(String username) {
        AdminExample example = new AdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<Admin> adminList = adminMapper.selectByExample(example);
        if(adminList != null && adminList.size() > 0){
            return adminList.get(0);
        }
        return null;
    }

    @Override
    public List<Permission> getPermissionList(Integer id) {
        return adminRoleRelationDao.getPermissionList(id);
    }
}
