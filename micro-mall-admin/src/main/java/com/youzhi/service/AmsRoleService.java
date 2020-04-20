package com.youzhi.service;

import com.youzhi.dto.AmsRoleParam;
import com.youzhi.model.AmsPermission;
import com.youzhi.model.AmsRole;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/30 14:06
 */
public interface AmsRoleService {
    int add(AmsRoleParam amsRoleParam);

    int update(Integer id, AmsRoleParam amsRoleParam);

    int deleteBatch(List<Integer> ids);

    List<AmsPermission> getPermissionList(Integer roleId);

    int updatePermission(Integer roleId, List<Integer> permissionIds);

    List<AmsRole> listPage(Integer pageSize, Integer pageNum);

    List<AmsRole> getList();
}
