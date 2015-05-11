package com.icangqu.share.model.dto;

import com.icangqu.share.model.entity.CqPublishBelongLabel;

import java.util.Date;


public class CqPublishBelongLabelDto extends CqPublishBelongLabel {
    /**
     * default constructor
     */
    public CqPublishBelongLabelDto() {
    	super();
    }

    /**
     * full constructor
     */
    public CqPublishBelongLabelDto(Integer id, Integer publishId, Integer labelId, Date createDatetime) {
        super(id, publishId, labelId, createDatetime);
    }
}
