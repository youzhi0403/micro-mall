package com.youzhi.dao;

import com.youzhi.model.OmsOrderOperateHistory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/2 10:08
 */
public interface OmsOrderOperateHistoryDao {
    int addBatch(@Param("list") List<OmsOrderOperateHistory> orderOperateHistoryList);
}
