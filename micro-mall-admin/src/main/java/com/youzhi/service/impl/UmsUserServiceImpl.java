package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dao.UmsUserDao;
import com.youzhi.dto.UmsUserParam;
import com.youzhi.dto.UmsUserQueryParam;
import com.youzhi.mapper.UmsUserMapper;
import com.youzhi.model.UmsUser;
import com.youzhi.model.UmsUserExample;
import com.youzhi.service.UmsUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author cwj
 * @date 2020/1/3 11:54
 */
@Service
public class UmsUserServiceImpl implements UmsUserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsUserServiceImpl.class);

    @Autowired
    private UmsUserDao userDao;

    @Autowired
    private UmsUserMapper userMapper;

    @Override
    public List<UmsUser> listPage(UmsUserQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<UmsUser> result = userDao.list(queryParam);
        return result;
    }

    @Override
    public int add(UmsUserParam umsUserParam) {
        UmsUser user = new UmsUser();
        BeanUtils.copyProperties(umsUserParam,user);
        user.setBalance(0);
        user.setCreateTime(new Date());
        user.setStatus(1);
        int count = userMapper.insertSelective(user);
        return count;
    }

    @Override
    public int update(Integer id, UmsUserParam umsUserParam) {
        UmsUser user = new UmsUser();
        BeanUtils.copyProperties(umsUserParam,user);
        user.setId(id);
        /*更新商品*/
        UmsUserExample example = new UmsUserExample();
        example.createCriteria().andIdEqualTo(id);
        return userMapper.updateByExampleSelective(user,example);
    }

    @Override
    public int delete(Integer id) {
        /*todo 删除购物车数据*/
        /*todo 删除支入支出明细*/
        /*todo 删除用户地址*/
        /*todo 删除银行卡绑定信息*/
        /*todo 删除用户收藏*/
        /*todo 删除用户的优惠券信息*/
        /*todo 删除用户反馈信息*/
        /*todo 删除用户足迹*/
        /*todo 删除用户的订单信息，订单的物流信息，订单的物流子项信息*/

        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int forbidden(Integer id) {
        UmsUserExample example = new UmsUserExample();
        example.createCriteria().andIdEqualTo(id);
        return userMapper.updateByExampleSelective(new UmsUser().setStatus(0),example);
    }

    @Override
    public int launch(Integer id) {
        UmsUserExample example = new UmsUserExample();
        example.createCriteria().andIdEqualTo(id);
        return userMapper.updateByExampleSelective(new UmsUser().setStatus(1),example);
    }
}
