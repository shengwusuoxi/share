package com.icangqu.share.dao.impl;

import com.icangqu.share.dao.CqPublishDAO;
import com.icangqu.share.dao.impl.support.Condition;
import com.icangqu.share.dao.impl.support.QuickCondition;
import com.icangqu.share.model.entity.CqPublish;
import com.icangqu.share.model.entity.CqUser;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    public CqPublish getByPublishId(Integer publishId) {
        Condition condition = new QuickCondition(CqPublish.class);
        condition.addEqual("publishId", publishId);
        List<CqPublish> publishs = findByCondition(condition, null);
        if (publishs.size() != 0) {
            return publishs.get(0);
        }
        return null;
    }
}
