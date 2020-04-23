package com.youzhi.dto;

import com.youzhi.model.AmsPermission;
import lombok.Data;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/30 13:39
 */
@Data
public class AmsPermissionNode extends AmsPermission {
    private List<AmsPermissionNode> children;
}
