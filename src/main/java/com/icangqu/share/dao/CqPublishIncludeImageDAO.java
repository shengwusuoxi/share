package com.icangqu.share.dao;

import com.icangqu.share.model.entity.CqPublishIncludeImage;

import java.util.List;

/**
 * Created by TangLiuJun on 2015/5/11.
 */
public interface CqPublishIncludeImageDAO extends IOperations<CqPublishIncludeImage, Integer> {
    public List<CqPublishIncludeImage> getByPublishId(Integer publishId);

}
