package com.youzhi.dto;

import com.youzhi.model.*;
import lombok.Data;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/31 15:42
 */
@Data
public class OrderVo extends Order {
    private User user;

    private List<OrderGoodRelation> orderGoodRelationList;

    private List<Good> goodList;

    private Logistics logisticsList;

    private List<LogisticsItem> logisticsItemList;

}
