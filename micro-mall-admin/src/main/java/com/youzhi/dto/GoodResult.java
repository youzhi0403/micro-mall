package com.youzhi.dto;

import com.youzhi.model.Classification;
import com.youzhi.model.Good;

import java.util.List;

/**
 * @author cwj
 * @date 2020/1/18 17:23
 */
public class GoodResult extends Good {
    List<Classification> classificationList;
}
