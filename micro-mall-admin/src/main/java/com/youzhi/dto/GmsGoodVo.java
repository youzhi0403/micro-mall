package com.youzhi.dto;

import com.youzhi.model.GmsClassification;
import com.youzhi.model.GmsGood;
import lombok.Data;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/18 17:23
 */
@Data
public class GmsGoodVo extends GmsGood {
    List<Integer> classificationList;

    List<Integer> classificationNormalIds;

    List<Integer> classificationBodyIds;

    List<Integer> classificationDepartmentIds;
}
