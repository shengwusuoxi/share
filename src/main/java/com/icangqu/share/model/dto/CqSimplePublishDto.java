package com.icangqu.share.model.dto;

import java.io.Serializable;

public class CqSimplePublishDto implements Serializable {
	private String publishImageUrl;
	private String publishUserPortraitUrl;
	private String publishUserName;
	private String publishDate;

	public String getPublishImageUrl() {
		return publishImageUrl;
	}
	
	public void setPublishImageUrl(String publishImageUrl) {
		this.publishImageUrl = publishImageUrl;
	}

	public String getPublishUserPortraitUrl() {
		return publishUserPortraitUrl;
	}
	
	public void setPublishUserPortraitUrl(String publishUserPortraitUrl) {
		this.publishUserPortraitUrl = publishUserPortraitUrl;
	}
	
	public String getPublishUserName() {
		return publishUserName;
	}
	
	public void setPublishUserName(String publishUserName) {
		this.publishUserName = publishUserName;
	}
	
	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

}
