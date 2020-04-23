package com.youzhi.dto;

import com.youzhi.model.GmsClassification;
import lombok.Data;

import java.util.List;

/**
 * @author cwj
 * @date 2020/4/23 13:29
 */
@Data
public class GmsClassificationNode extends GmsClassification {
    private List<GmsClassificationNode> children;
}
