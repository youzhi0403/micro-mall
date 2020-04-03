package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.mapper.OmsOrderReturnReasonMapper;
import com.youzhi.model.OmsOrderReturnReason;
import com.youzhi.model.OmsOrderReturnReasonExample;
import com.youzhi.service.OmsOrderReturnReasonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/3 10:23
 */
@Service
public class OmsOrderReturnReasonServiceImpl implements OmsOrderReturnReasonService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OmsOrderReturnReasonServiceImpl.class);

    @Autowired
    private OmsOrderReturnReasonMapper returnReasonMapper;

    @Override
    public int add(OmsOrderReturnReason returnReason) {
        returnReason.setCreateTime(new Date());
        return returnReasonMapper.insertSelective(returnReason);
    }

    @Override
    public int update(Integer id, OmsOrderReturnReason returnReason) {
        returnReason.setId(id);
        return returnReasonMapper.updateByPrimaryKeySelective(returnReason);
    }

    @Override
    public int deleteBatch(List<Integer> ids) {
        OmsOrderReturnReasonExample omsOrderReturnReasonExample = new OmsOrderReturnReasonExample();
        omsOrderReturnReasonExample.createCriteria().andIdIn(ids);
        return returnReasonMapper.deleteByExample(omsOrderReturnReasonExample);
    }

    @Override
    public OmsOrderReturnReason detail(Integer id) {
        return returnReasonMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateStatus(List<Integer> ids, Integer status) {
        if(!status.equals(0)&&!status.equals(1)){
            return 0;
        }
        OmsOrderReturnReason record = new OmsOrderReturnReason();
        record.setStatus(status);
        OmsOrderReturnReasonExample example = new OmsOrderReturnReasonExample();
        example.createCriteria().andIdIn(ids);
        return returnReasonMapper.updateByExampleSelective(record,example);
    }

    @Override
    public List<OmsOrderReturnReason> listPage(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        OmsOrderReturnReasonExample example = new OmsOrderReturnReasonExample();
        example.setOrderByClause("sort desc");
        return returnReasonMapper.selectByExample(example);
    }
}
