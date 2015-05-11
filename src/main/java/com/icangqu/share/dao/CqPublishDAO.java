package com.icangqu.share.dao;

import com.icangqu.share.dao.IOperations;
import com.icangqu.share.model.entity.CqPublish;

/**
 * Created by TangLiuJun on 2015/5/11.
 */
public interface CqPublishDAO extends IOperations<CqPublish, Integer> {

    public CqPublish getByPublishId(Integer labelId);
    
}
