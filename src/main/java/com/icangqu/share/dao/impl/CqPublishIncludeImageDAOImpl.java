package com.icangqu.share.dao.impl;

import com.icangqu.share.dao.CqPublishIncludeImageDAO;
import com.icangqu.share.model.entity.CqPublishIncludeImage;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TangLiuJun on 2015/5/11.
 */
@Repository("")
public class CqPublishIncludeImageDAOImpl extends CqAbstractHibernateDAO<CqPublishIncludeImage, Integer>  implements CqPublishIncludeImageDAO {
    public CqPublishIncludeImageDAOImpl() {
        super();
        setClazz(CqPublishIncludeImage.class);
    }

    @Override
    public List<CqPublishIncludeImage> getByPublishId(Integer publishId) {
        return null;
    }

}
