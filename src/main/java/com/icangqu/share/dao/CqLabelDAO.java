package com.icangqu.share.dao;

import com.icangqu.share.model.entity.CqLabel;

/**
 * Created by TangLiuJun on 2015/5/11.
 */
public interface CqLabelDAO extends IOperations<CqLabel, Integer> {

    public CqLabel getByLabelId(Integer labelId);

}
