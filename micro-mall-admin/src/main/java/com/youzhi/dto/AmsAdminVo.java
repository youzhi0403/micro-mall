package com.youzhi.dto;

import com.youzhi.model.AmsAdmin;
import com.youzhi.model.AmsRole;
import lombok.Data;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/21 9:40
 */
@Data
public class AmsAdminVo extends AmsAdmin {
    List<AmsRole> roleList;
}
