package com.youzhi.service;

import com.youzhi.dto.OmsOrderReturnApplyParam;
import com.youzhi.dto.OmsOrderReturnApplyVo;
import com.youzhi.dto.OmsOrderReturnApplyQueryParam;
import com.youzhi.model.OmsOrderReturnApply;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/3 9:30
 */
public interface OmsOrderReturnApplyService {
    List<OmsOrderReturnApply> listPage(OmsOrderReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    int deleteBatch(List<Integer> ids);

    OmsOrderReturnApplyVo detail(Integer id);

    int updateStatus(Integer id, OmsOrderReturnApplyParam returnApplyParam);
}
