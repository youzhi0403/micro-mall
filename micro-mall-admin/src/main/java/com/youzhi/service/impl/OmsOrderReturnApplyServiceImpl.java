package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dao.OmsOrderReturnApplyDao;
import com.youzhi.dto.OmsOrderReturnApplyParam;
import com.youzhi.dto.OmsOrderReturnApplyQueryParam;
import com.youzhi.dto.OmsOrderReturnApplyVo;
import com.youzhi.mapper.OmsOrderReturnApplyMapper;
import com.youzhi.model.OmsOrderReturnApply;
import com.youzhi.model.OmsOrderReturnApplyExample;
import com.youzhi.service.OmsOrderReturnApplyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/3 9:32
 */
@Service
public class OmsOrderReturnApplyServiceImpl implements OmsOrderReturnApplyService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OmsOrderReturnApplyServiceImpl.class);

    @Autowired
    private OmsOrderReturnApplyDao returnApplyDao;

    @Autowired
    private OmsOrderReturnApplyMapper returnApplyMapper;

    @Override
    public List<OmsOrderReturnApply> listPage(OmsOrderReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return returnApplyDao.list(queryParam);
    }

    @Override
    public int deleteBatch(List<Integer> ids) {
        OmsOrderReturnApplyExample example = new OmsOrderReturnApplyExample();
        example.createCriteria().andIdIn(ids).andStatusEqualTo(3);
        return returnApplyMapper.deleteByExample(example);
    }

    @Override
    public OmsOrderReturnApplyVo detail(Integer id) {
        return returnApplyDao.detail(id);
    }

    @Override
    public int updateStatus(Integer id, OmsOrderReturnApplyParam returnApplyParam) {
        Integer status = returnApplyParam.getStatus();
        OmsOrderReturnApply returnApply = new OmsOrderReturnApply();
        if(status.equals(1)){
            //确认退货
            returnApply.setId(id);
            returnApply.setStatus(1);
            returnApply.setReturnAmount(returnApplyParam.getReturnAmount());
            returnApply.setCompanyAddressId(returnApplyParam.getCompanyAddressId());
            returnApply.setHandleTime(new Date());
            returnApply.setHandleMan(returnApplyParam.getHandleMan());
            returnApply.setHandleRemark(returnApplyParam.getHandleRemark());
        }else if(status.equals(2)){
            //完成退货
            returnApply.setId(id);
            returnApply.setStatus(2);
            returnApply.setReceiveTime(new Date());
            returnApply.setReceiveMan(returnApplyParam.getReceiveMan());
            returnApply.setReceiveRemark(returnApplyParam.getReceiveRemark());
        }else if(status.equals(3)){
            //拒绝退货
            returnApply.setId(id);
            returnApply.setStatus(3);
            returnApply.setHandleTime(new Date());
            returnApply.setHandleMan(returnApplyParam.getHandleMan());
            returnApply.setHandleRemark(returnApplyParam.getHandleRemark());
        }else{
            return 0;
        }
        return returnApplyMapper.updateByPrimaryKeySelective(returnApply);
    }
}
