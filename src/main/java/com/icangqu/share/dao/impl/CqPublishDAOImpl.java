package com.icangqu.share.dao.impl;

import com.icangqu.share.dao.CqPublishDAO;
import com.icangqu.share.model.entity.CqPublish;
import org.springframework.stereotype.Repository;

/**
 * Created by TangLiuJun on 2015/5/11.
 */
@Repository("cqPublishDAOImpl")
public class CqPublishDAOImpl extends CqAbstractHibernateDAO<CqPublish, Integer>  implements CqPublishDAO {
    public CqPublishDAOImpl() {
        super();
        setClazz(CqPublish.class);
    }

    @Override
    public CqPublish getByPublishId(Integer labelId) {
        return null;
    }
}
