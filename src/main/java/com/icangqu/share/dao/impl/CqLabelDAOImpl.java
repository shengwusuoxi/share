package com.icangqu.share.dao.impl;

import com.icangqu.share.dao.CqLabelDAO;
import com.icangqu.share.dao.impl.support.Condition;
import com.icangqu.share.dao.impl.support.QuickCondition;
import com.icangqu.share.model.entity.CqLabel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TangLiuJun on 2015/5/11.
 */
@Repository("cqLabelDAOImpl")
public class CqLabelDAOImpl extends CqAbstractHibernateDAO<CqLabel, Integer>  implements CqLabelDAO {
    public CqLabelDAOImpl() {
        super();
        setClazz(CqLabel.class);
    }

    @Override
    public CqLabel getByLabelId(Integer labelId) {
        Condition condition = new QuickCondition(CqLabel.class);
        condition.addEqual("labelId", labelId);
        List<CqLabel> labels = findByCondition(condition, null);
        if (labels.size() != 0) {
            return labels.get(0);
        }
        return null;
    }
}
