package com.youzhi.dto;

import com.youzhi.model.*;
import lombok.Data;

import java.util.List;

/**
 * @author youzhi
 * @date 2020/4/1 13:51
 */
@Data
public class SmsCouponsVo extends SmsCoupons {
    private List<SmsCouponsClassificationRelation> couponsClassificationRelationList;

    private List<SmsCouponsGoodRelation> couponsGoodRelationList;
}
