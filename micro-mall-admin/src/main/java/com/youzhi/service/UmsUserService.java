package com.youzhi.service;

import com.youzhi.dto.UmsUserParam;
import com.youzhi.dto.UmsUserQueryParam;
import com.youzhi.model.UmsUser;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/3 11:54
 */
public interface UmsUserService {

    List<UmsUser> listPage(UmsUserQueryParam queryParam, Integer pageSize, Integer pageNum);

    int add(UmsUserParam umsUserParam);

    int update(Integer id, UmsUserParam umsUserParam);

    int delete(Integer id);

    int forbidden(Integer id);

    int launch(Integer id);
}
