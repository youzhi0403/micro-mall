package com.youzhi.service.impl;

import com.github.pagehelper.PageHelper;
import com.youzhi.dao.UserDao;
import com.youzhi.dto.UserParam;
import com.youzhi.dto.UserQueryParam;
import com.youzhi.mapper.UserMapper;
import com.youzhi.model.User;
import com.youzhi.model.UserExample;
import com.youzhi.service.UserService;
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
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listPage(UserQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return userDao.list(queryParam);
    }

    @Override
    public int add(UserParam userParam) {
        User user = new User();
        BeanUtils.copyProperties(userParam,user);
        user.setBalance(0);
        user.setCreateTime(new Date());
        user.setDeleteStatus(0);
        int count = userMapper.insertSelective(user);
        return count;
    }

    @Override
    public int update(Integer id, UserParam userParam) {
        User user = new User();
        BeanUtils.copyProperties(userParam,user);
        user.setId(id);
        /*更新商品*/
        UserExample example = new UserExample();
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
        /*todo 删除用户的订单通知(notification_order)信息*/
        /*todo 删除用户的订单信息，订单的物流信息，订单的物流子项信息*/

        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int forbidden(Integer id) {
        UserExample example = new UserExample();
        example.createCriteria().andIdEqualTo(id);
        return userMapper.updateByExampleSelective(new User().setDeleteStatus(1),example);
    }

    @Override
    public int launch(Integer id) {
        UserExample example = new UserExample();
        example.createCriteria().andIdEqualTo(id);
        return userMapper.updateByExampleSelective(new User().setDeleteStatus(0),example);
    }
}
