package com.youzhi.dao;

import com.youzhi.dto.UmsUserQueryParam;
import com.youzhi.model.UmsUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/30 11:52
 */
public interface UmsUserDao {

    List<UmsUser> list(@Param("queryParam") UmsUserQueryParam queryParam);
}
