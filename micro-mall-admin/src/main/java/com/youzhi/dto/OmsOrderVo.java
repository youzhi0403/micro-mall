package com.youzhi.dto;

import com.youzhi.model.*;
import lombok.Data;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/3/31 15:42
 */
@Data
public class OmsOrderVo extends OmsOrder {

    private List<OmsOrderItem> orderItemList;

    private List<OmsOrderOperateHistory> orderOperateHistoryList;

    private OmsOrderReturnApply orderReturnApply;

}
