package com.youzhi.dao;

import com.youzhi.dto.UserQueryParam;
import com.youzhi.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/30 11:52
 */
public interface UserDao {

    List<User> list(@Param("queryParam") UserQueryParam queryParam);
}
