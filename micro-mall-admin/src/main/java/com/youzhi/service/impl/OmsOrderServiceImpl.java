package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dao.OmsOrderDao;
import com.youzhi.dao.OmsOrderOperateHistoryDao;
import com.youzhi.dto.OmsOrderDeliveryParam;
import com.youzhi.dto.OmsOrderQueryParam;
import com.youzhi.dto.OmsOrderReceiverInfoParam;
import com.youzhi.dto.OmsOrderVo;
import com.youzhi.mapper.OmsOrderMapper;
import com.youzhi.mapper.OmsOrderOperateHistoryMapper;
import com.youzhi.model.OmsOrder;
import com.youzhi.model.OmsOrderExample;
import com.youzhi.model.OmsOrderOperateHistory;
import com.youzhi.service.OmsOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author youzhi
 * @date 2020/3/31 15:17
 */
@Service
public class OmsOrderServiceImpl implements OmsOrderService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OmsOrderServiceImpl.class);

    @Autowired
    private OmsOrderDao orderDao;

    @Autowired
    private OmsOrderMapper orderMapper;

    @Autowired
    private OmsOrderOperateHistoryDao orderOperateHistoryDao;

    @Autowired
    private OmsOrderOperateHistoryMapper orderOperateHistoryMapper;

    @Override
    public List<OmsOrder> listPage(OmsOrderQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return orderDao.list(queryParam);
    }

    @Override
    @Transactional
    public int delivery(List<OmsOrderDeliveryParam> omsOrderDeliveryParamList) {
        int count = orderDao.delivery(omsOrderDeliveryParamList);
        /*添加操作记录*/
        List<OmsOrderOperateHistory> operateHistoryList = omsOrderDeliveryParamList.stream()
                .map(item -> new OmsOrderOperateHistory().setOrderId(item.getOrderId())
                        .setCreateTime(new Date())
                        .setOperateMan("后台管理员")
                        .setOrderStatus(2)
                        .setRemark("完成发货")).collect(Collectors.toList());
        orderOperateHistoryDao.addBatch(operateHistoryList);
        return count;
    }

    @Override
    @Transactional
    public int close(List<Integer> ids, String remark) {
        OmsOrder order = new OmsOrder();
        order.setStatus(4);
        OmsOrderExample orderExample = new OmsOrderExample();
        orderExample.createCriteria().andDeleteStatusEqualTo(0).andIdIn(ids);
        int count = orderMapper.updateByExampleSelective(order,orderExample);
        List<OmsOrderOperateHistory> orderOperateHistoryList = ids.stream()
                .map(orderId -> new OmsOrderOperateHistory().setOrderId(orderId)
                    .setCreateTime(new Date())
                    .setOperateMan("后台管理员")
                    .setOrderStatus(4)
                    .setRemark("订单关闭：" + remark)
        ).collect(Collectors.toList());
        orderOperateHistoryDao.addBatch(orderOperateHistoryList);
        return count;
    }

    @Override
    public int delete(List<Integer> ids) {
        OmsOrder order = new OmsOrder();
        order.setDeleteStatus(0);
        OmsOrderExample orderExample = new OmsOrderExample();
        orderExample.createCriteria().andDeleteStatusEqualTo(0).andIdIn(ids);
        return orderMapper.updateByExampleSelective(order,orderExample);
    }

    @Override
    public OmsOrderVo detail(Integer id) {
        return orderDao.detail(id);
    }

    @Override
    @Transactional
    public int updateReceiverInfo(OmsOrderReceiverInfoParam omsOrderReceiverInfoParam) {
        OmsOrder order = new OmsOrder();
        BeanUtils.copyProperties(omsOrderReceiverInfoParam,order);
        int count = orderMapper.updateByPrimaryKeySelective(order);
        /*插入操作记录*/
        OmsOrderOperateHistory orderOperateHistory = new OmsOrderOperateHistory();
        orderOperateHistory.setOrderId(omsOrderReceiverInfoParam.getId())
            .setCreateTime(new Date())
            .setOperateMan("后台管理员")
            .setOrderStatus(omsOrderReceiverInfoParam.getStatus())
            .setRemark("修改收货人信息");
        orderOperateHistoryMapper.insertSelective(orderOperateHistory);
        return count;
    }

    @Override
    @Transactional
    public int updateRemark(Integer id, String remark, Integer status) {
        int count = orderMapper.updateByPrimaryKeySelective(new OmsOrder()
            .setId(id)
            .setRemark(remark));
        OmsOrderOperateHistory history = new OmsOrderOperateHistory();
        history.setOrderId(id);
        history.setCreateTime(new Date());
        history.setOperateMan("后台管理员");
        history.setOrderStatus(status);
        history.setRemark("修改备注信息："+remark);
        orderOperateHistoryMapper.insert(history);
        return count;
    }
}
