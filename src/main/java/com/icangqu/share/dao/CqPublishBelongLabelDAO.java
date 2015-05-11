package com.icangqu.share.dao;

import com.icangqu.share.model.entity.CqPublishBelongLabel;

import java.util.List;

/**
 * Created by TangLiuJun on 2015/5/11.
 */
public interface CqPublishBelongLabelDAO extends IOperations<CqPublishBelongLabel, Integer> {

    public List<CqPublishBelongLabel> getByLabelId(Integer labelId);
    
}
