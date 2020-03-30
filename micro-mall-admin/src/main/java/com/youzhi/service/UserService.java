package com.youzhi.service;

import com.youzhi.dto.UserParam;
import com.youzhi.dto.UserQueryParam;
import com.youzhi.model.Permission;
import com.youzhi.model.User;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/3 11:54
 */
public interface UserService {

    List<User> listPage(UserQueryParam queryParam, Integer pageSize, Integer pageNum);

    int add(UserParam userParam);

    int update(Integer id, UserParam userParam);

    int delete(Integer id);

    int forbidden(Integer id);

    int launch(Integer id);
}
