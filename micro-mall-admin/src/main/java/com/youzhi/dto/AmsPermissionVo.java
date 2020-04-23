package com.youzhi.dto;

import com.youzhi.model.AmsPermission;
import lombok.Data;

import java.util.List;

/**
 * @author cwj
 * @date 2020/4/23 9:40
 */
@Data
public class AmsPermissionVo extends AmsPermission {
    List<Integer> parentIds;
}
