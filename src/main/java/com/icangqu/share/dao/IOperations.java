package com.icangqu.share.dao;


import com.icangqu.share.dao.impl.support.Condition;
import com.icangqu.share.dao.impl.support.Page;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2015/3/12 0012.
 */
public interface IOperations<T extends Serializable, PK extends Serializable> {

    T getById(final PK id);

    List<T> findAll();

    public List<T> findByCondition(Condition condition, Page page);

    PK create(final T entity);

    void update(final T entity);

    T saveOrUpdate(final T entity);

    void delete(final T entity);

    void deleteById(final PK entityId);
}
