package com.youzhi.dto;

import com.youzhi.model.Permission;
import lombok.Data;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/30 13:39
 */
@Data
public class PermissionNode extends Permission {
    private List<PermissionNode> children;

}
