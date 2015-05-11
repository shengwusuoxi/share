package com.icangqu.share.dao.impl;

import com.icangqu.share.dao.CqPublishBelongLabelDAO;
import com.icangqu.share.model.entity.CqPublishBelongLabel;
import org.springframework.stereotype.Repository;

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
        return null;
    }
}
