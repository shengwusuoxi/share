package com.icangqu.share.dao;

import com.icangqu.share.model.entity.CqUser;

/**
 * Created by TangLiuJun on 2015/5/11.
 */
public interface CqUserDAO extends IOperations<CqUser, Integer> {

    public CqUser getByUserId(Integer userId);
    
}
