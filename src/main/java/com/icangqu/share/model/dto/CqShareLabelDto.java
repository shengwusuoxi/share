package com.icangqu.share.model.dto;

import com.icangqu.share.model.entity.CqLabel;

import java.util.List;

public class CqShareLabelDto extends CqLabel {
	private String creatorName;
	private String creatorPortraitUrl;
	private String createDate;
	private List<CqSimplePublishDto> simplePublishList;

	public CqShareLabelDto() {
		super();
	}

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getCreatorPortraitUrl() {
        return creatorPortraitUrl;
    }

    public void setCreatorPortraitUrl(String creatorPortraitUrl) {
        this.creatorPortraitUrl = creatorPortraitUrl;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public List<CqSimplePublishDto> getSimplePublishList() {
        return simplePublishList;
    }

    public void setSimplePublishList(List<CqSimplePublishDto> simplePublishList) {
        this.simplePublishList = simplePublishList;
    }
}
