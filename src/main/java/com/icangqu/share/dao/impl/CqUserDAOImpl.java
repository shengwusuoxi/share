package com.icangqu.share.dao.impl;

import com.icangqu.share.dao.CqUserDAO;
import com.icangqu.share.dao.impl.support.Condition;
import com.icangqu.share.dao.impl.support.QuickCondition;
import com.icangqu.share.model.entity.CqUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TangLiuJun on 2015/5/11.
 */
@Repository("cqUserDAOImpl")
public class CqUserDAOImpl extends CqAbstractHibernateDAO<CqUser, Integer>  implements CqUserDAO {
    public CqUserDAOImpl() {
        super();
        setClazz(CqUser.class);
    }

    @Override
    public CqUser getByUserId(Integer userId) {
        Condition condition = new QuickCondition(CqUser.class);
        condition.addEqual("userId", userId);
        List<CqUser> users = findByCondition(condition, null);
        if (users.size() != 0) {
            return users.get(0);
        }
        return null;
    }
}
