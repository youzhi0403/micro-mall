package com.youzhi.service;

import com.youzhi.dto.OmsOrderDeliveryParam;
import com.youzhi.dto.OmsOrderQueryParam;
import com.youzhi.dto.OmsOrderReceiverInfoParam;
import com.youzhi.dto.OmsOrderVo;
import com.youzhi.model.OmsOrder;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/31 15:16
 */
public interface OmsOrderService {
    List<OmsOrder> listPage(OmsOrderQueryParam queryParam, Integer pageSize, Integer pageNum);

    int delivery(List<OmsOrderDeliveryParam> omsOrderDeliveryParamList);

    int close(List<Integer> ids, String remark);

    int delete(List<Integer> ids);

    OmsOrderVo detail(Integer id);

    int updateReceiverInfo(OmsOrderReceiverInfoParam omsOrderReceiverInfoParam);

    int updateRemark(Integer id, String remark, Integer status);
}
