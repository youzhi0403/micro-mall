package com.youzhi.dao;

import com.youzhi.dto.OmsOrderReturnApplyQueryParam;
import com.youzhi.dto.OmsOrderReturnApplyVo;
import com.youzhi.model.OmsOrderReturnApply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/3 9:34
 */
public interface OmsOrderReturnApplyDao {
    List<OmsOrderReturnApply> list(@Param("queryParam") OmsOrderReturnApplyQueryParam queryParam);

    OmsOrderReturnApplyVo detail(Integer id);

}
