package com.icangqu.share.model.dto;

import com.icangqu.share.model.entity.CqUser;

import java.util.List;

public class CqUserDto extends CqUser {
	private String userIdentityName;
	private List<String> drawingUrlList;

	public String getUserIdentityName() {
		return userIdentityName;
	}

	public void setUserIdentityName(String userIdentityName) {
		this.userIdentityName = userIdentityName;
	}

	public List<String> getDrawingUrlList() {
		return drawingUrlList;
	}

	public void setDrawingUrlList(List<String> drawingUrlList) {
		this.drawingUrlList = drawingUrlList;
	}
}
