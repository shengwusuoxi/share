package com.icangqu.share.dao;

import com.icangqu.share.model.entity.CqShareLabel;

/**
 * Created by TangLiuJun on 2015/5/11.
 */
public interface CqShareLabelDAO extends IOperations<CqShareLabel, Integer> {

    public CqShareLabel getByShareId(Integer shareId);

}
