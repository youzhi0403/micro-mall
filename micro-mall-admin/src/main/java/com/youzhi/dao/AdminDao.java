package com.youzhi.dao;

import com.youzhi.dto.AdminResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/21 9:45
 */
public interface AdminDao {
    List<AdminResult> getAdminList(@Param("username") String username);
}
