package com.icangqu.share.service;

import com.icangqu.share.dao.IOperations;
import com.icangqu.share.dao.impl.support.Condition;
import com.icangqu.share.dao.impl.support.Page;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Transactional
public abstract class CqAbstractService<T extends Serializable, PK extends Serializable> implements IOperations<T, PK> {

    protected abstract IOperations<T, PK> getDao();

    @Override
    public T getById(final PK id) {
        return getDao().getById(id);
    }

    @Override
    public List<T> findAll() {
        return getDao().findAll();
    }

    @Override
    public List<T> findByCondition(Condition condition, Page page){
        return getDao().findByCondition(condition, page);
    }

    @Override
    public PK create(final T entity) {
        return getDao().create(entity);
    }

    @Override
    public void update(final T entity){
        getDao().update(entity);
    }

    @Override
    public T saveOrUpdate(final T entity) {
        return getDao().saveOrUpdate(entity);
    }

    @Override
    public void delete(final T entity) {
        getDao().delete(entity);
    }

    @Override
    public void deleteById(final PK entityId) {
        getDao().deleteById(entityId);
    }
}