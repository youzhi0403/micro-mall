package com.youzhi.dto;

import com.youzhi.model.Admin;
import com.youzhi.model.Role;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/21 9:40
 */
@Data
public class AdminVo extends Admin {
    List<Role> roleList;
}
