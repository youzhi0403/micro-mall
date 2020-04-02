package com.youzhi.service;

import com.youzhi.dto.AmsPermissionNode;
import com.youzhi.dto.AmsPermissionParam;
import com.youzhi.model.AmsPermission;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/30 13:19
 */
public interface AmsPermissionService {
    int add(AmsPermissionParam amsPermissionParam);

    int update(Integer id, AmsPermissionParam amsPermissionParam);

    int deleteBatch(List<Integer> ids);

    List<AmsPermissionNode> treeList();

    List<AmsPermission> listPage(Integer pageSize, Integer pageNum);
}
