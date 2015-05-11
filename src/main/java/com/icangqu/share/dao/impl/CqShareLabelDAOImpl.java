package com.icangqu.share.dao.impl;

import com.icangqu.share.dao.CqShareLabelDAO;
import com.icangqu.share.dao.impl.support.Condition;
import com.icangqu.share.dao.impl.support.QuickCondition;
import com.icangqu.share.model.entity.CqShareLabel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TangLiuJun on 2015/5/11.
 */
@Repository("cqShareLabelDAOImpl")
public class CqShareLabelDAOImpl extends CqAbstractHibernateDAO<CqShareLabel, String>  implements CqShareLabelDAO {
    public CqShareLabelDAOImpl() {
        super();
        setClazz(CqShareLabel.class);
    }

    @Override
    public CqShareLabel getByShareId(String shareId) {
        Condition condition = new QuickCondition(CqShareLabel.class);
        condition.addEqual("shareId", shareId);
        List<CqShareLabel> shareLabels = findByCondition(condition, null);
        if (shareLabels.size() != 0) {
            return shareLabels.get(0);
        }
        return null;
    }
}
