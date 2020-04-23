package com.youzhi.dto;

import com.youzhi.model.GmsClassification;
import lombok.Data;

import java.util.List;

/**
 * @author cwj
 * @date 2020/4/23 13:46
 */
@Data
public class GmsClassificationVo extends GmsClassification {
    List<Integer> parentIds;
}
