package com.youzhi.dao;

import com.youzhi.dto.AdminQueryParam;
import com.youzhi.dto.AdminVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/21 9:45
 */
public interface AdminDao {
    List<AdminVo> getAdminList(@Param("username") String username);

    List<AdminVo> list(@Param("queryParam") AdminQueryParam queryParam);
}
