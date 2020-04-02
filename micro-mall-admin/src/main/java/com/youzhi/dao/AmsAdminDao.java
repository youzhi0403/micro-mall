package com.youzhi.dao;

import com.youzhi.dto.AmsAdminQueryParam;
import com.youzhi.dto.AmsAdminVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/21 9:45
 */
public interface AmsAdminDao {
    List<AmsAdminVo> getAdminList(@Param("username") String username);

    List<AmsAdminVo> list(@Param("queryParam") AmsAdminQueryParam queryParam);
}
