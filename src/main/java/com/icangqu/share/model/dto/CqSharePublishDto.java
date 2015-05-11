package com.icangqu.share.model.dto;

import com.icangqu.share.model.entity.CqPublish;

import java.util.List;

public class CqSharePublishDto extends CqPublish {
	private String creatorName;
	private String creatorPortraitUrl;
	private String createDate;
	private String ratio;
	private List<String> publishIncludeImageUrlList;
	private List<String> recommendPublishImageUrlList;

	public CqSharePublishDto() {
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

	public List<String> getRecommendPublishImageUrlList() {
		return recommendPublishImageUrlList;
	}

	public void setRecommendPublishImageUrlList(
			List<String> recommendPublishImageUrlList) {
		this.recommendPublishImageUrlList = recommendPublishImageUrlList;
	}

	public String getRatio() {
		return ratio;
	}

	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

	public List<String> getPublishIncludeImageUrlList() {
		return publishIncludeImageUrlList;
	}

	public void setPublishIncludeImageUrlList(
			List<String> publishIncludeImageUrlList) {
		this.publishIncludeImageUrlList = publishIncludeImageUrlList;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
}
