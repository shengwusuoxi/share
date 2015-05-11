package com.icangqu.share.dao.impl;

import com.icangqu.share.dao.CqPublishBelongLabelDAO;
import com.icangqu.share.dao.impl.support.Condition;
import com.icangqu.share.dao.impl.support.QuickCondition;
import com.icangqu.share.model.entity.CqPublishBelongLabel;
import com.icangqu.share.model.entity.CqUser;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by TangLiuJun on 2015/5/11.
 */
@Repository("cqPublishBelongLabelDAOImpl")
public class CqPublishBelongLabelDAOImpl extends CqAbstractHibernateDAO<CqPublishBelongLabel, Integer>  implements CqPublishBelongLabelDAO {
    public CqPublishBelongLabelDAOImpl() {
        super();
        setClazz(CqPublishBelongLabel.class);
    }

    @Override
    public List<CqPublishBelongLabel> getByLabelId(Integer labelId) {
        String queryStr = "FROM CqPublishBelongLabel p where p.labelId=:labelId order by p.id desc";
        Query query = getCurrentSession().createQuery(queryStr)
                .setParameter("labelId", labelId);
        query.setFirstResult(0).setMaxResults(4);
        List<CqPublishBelongLabel> publishBelongLabels = query.list();
        return publishBelongLabels;
    }
}
