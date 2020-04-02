package com.youzhi.dao;

import com.youzhi.dto.OmsOrderDeliveryParam;
import com.youzhi.dto.OmsOrderQueryParam;
import com.youzhi.dto.OmsOrderVo;
import com.youzhi.model.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/31 15:17
 */
public interface OmsOrderDao {
    List<OmsOrder> list(@Param("queryParam") OmsOrderQueryParam queryParam);

    int delivery(List<OmsOrderDeliveryParam> omsOrderDeliveryParamList);

    OmsOrderVo detail(@Param("id") Integer id);

}
