package com.icangqu.share.enums;

/**
 * 分享平台值
 * 
 * @author wuqiang
 * 
 */
public enum ShareType {
	/**
	 * 微信朋友圈
	 */
	WX_MOMENTS(1),
	/**
	 * 发送给微信好友
	 */
	WX_FRIENDS(2),
	/**
	 * 微博
	 */
	SINA_WEIBO(3),
	/**
	 * QQ
	 */
	QQ(4),
	/**
	 * 未知
	 */
	UNKNOWN(0);

	// 值
	public final int val;

	private ShareType(int val) {
		this.val = val;
	}

}
