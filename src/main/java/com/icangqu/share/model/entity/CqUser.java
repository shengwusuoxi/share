package com.icangqu.share.model.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * HyUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@org.hibernate.annotations.Entity(dynamicInsert = true)
@Table(name = "hy_user", uniqueConstraints = {
		@UniqueConstraint(columnNames = "hy_id"),
		@UniqueConstraint(columnNames = "user_key") })
public class CqUser implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String hyId;
	private String userKey;
	private String userSecret;
	private String logname;
	private String nickName;
	private Integer isLock;
	private Integer isPushLike;
	private Integer isPushComments;
	private Integer isPushFollow;
	private Integer status;
	private String randomKey;
	private String password;
	private Long telephone;
	private String email;
	private Integer fansCount;
	private Integer atCount;
	private Integer followCount;
	private Integer friendCount;
	private Integer commentCount;
	private Integer scoreCount;
	private String baiduChannelIdUserId;
	private Integer hyIdSetCount;
	private String userHeaderPortrait;
	private String backgroundPic;
	private String location;
	private String latitude;
	private String longitude;
	private Integer isShowLocation;
	private String desc;
	private String labelInfo1;
	private String labelInfo2;
	private Integer identity;
	private Integer gender;
	private Integer isIdentification;
	private Integer openAccessLevel;
	private Integer lastLoginPlatform;
	private Timestamp lastLoginTime;
	private Timestamp createTime;
	private Timestamp updateTime;
	private Integer platform;
	private String appVersion;
	private Long appVersionUpdateTime;
	private Long lastLogoutTime;

	// Constructors

	/** default constructor */
	public CqUser() {
	}

	/** minimal constructor */
	public CqUser(String hyId, String userKey, String userSecret,
                  String logname, Integer status, String randomKey, String password,
                  String baiduChannelIdUserId, Integer hyIdSetCount, Integer isShowLocation) {
		this.hyId = hyId;
		this.userKey = userKey;
		this.userSecret = userSecret;
		this.logname = logname;
		this.status = status;
		this.randomKey = randomKey;
		this.password = password;
		this.baiduChannelIdUserId= baiduChannelIdUserId;
		this.hyIdSetCount = hyIdSetCount;
		this.isShowLocation = isShowLocation;
	}

	

	public CqUser(Integer userId, String hyId, String userKey,
                  String userSecret, String logname, String nickName, Integer isLock,
                  Integer isPushLike, Integer isPushComments, Integer isPushFollow,
                  Integer status, String randomKey, String password, Long telephone,
                  String email, Integer fansCount, Integer atCount,
                  Integer followCount, Integer friendCount, Integer commentCount,
                  Integer scoreCount, String baiduChannelIdUserId,
                  Integer hyIdSetCount, String userHeaderPortrait,
                  String backgroundPic, String location, String latitude,
                  String longitude, Integer isShowLocation, String desc,
                  String labelInfo1, String labelInfo2, Integer identity,
                  Integer gender, Integer isIdentification, Integer openAccessLevel,
                  Integer lastLoginPlatform, Timestamp lastLoginTime,
                  Timestamp createTime, Timestamp updateTime, Integer platform,
                  String appVersion, Long appVersionUpdateTime, Long lastLogoutTime) {
		super();
		this.userId = userId;
		this.hyId = hyId;
		this.userKey = userKey;
		this.userSecret = userSecret;
		this.logname = logname;
		this.nickName = nickName;
		this.isLock = isLock;
		this.isPushLike = isPushLike;
		this.isPushComments = isPushComments;
		this.isPushFollow = isPushFollow;
		this.status = status;
		this.randomKey = randomKey;
		this.password = password;
		this.telephone = telephone;
		this.email = email;
		this.fansCount = fansCount;
		this.atCount = atCount;
		this.followCount = followCount;
		this.friendCount = friendCount;
		this.commentCount = commentCount;
		this.scoreCount = scoreCount;
		this.baiduChannelIdUserId = baiduChannelIdUserId;
		this.hyIdSetCount = hyIdSetCount;
		this.userHeaderPortrait = userHeaderPortrait;
		this.backgroundPic = backgroundPic;
		this.location = location;
		this.latitude = latitude;
		this.longitude = longitude;
		this.isShowLocation = isShowLocation;
		this.desc = desc;
		this.labelInfo1 = labelInfo1;
		this.labelInfo2 = labelInfo2;
		this.identity = identity;
		this.gender = gender;
		this.isIdentification = isIdentification;
		this.openAccessLevel = openAccessLevel;
		this.lastLoginPlatform = lastLoginPlatform;
		this.lastLoginTime = lastLoginTime;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.platform = platform;
		this.appVersion = appVersion;
		this.appVersionUpdateTime = appVersionUpdateTime;
		this.lastLogoutTime = lastLogoutTime;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "hy_id", unique = true, nullable = false, length = 20)
	public String getHyId() {
		return this.hyId;
	}

	public void setHyId(String hyId) {
		this.hyId = hyId;
	}

	@Column(name = "user_key", unique = true, nullable = false, length = 36)
	public String getUserKey() {
		return this.userKey;
	}

	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}

	@Column(name = "user_secret", nullable = false, length = 32)
	public String getUserSecret() {
		return this.userSecret;
	}

	public void setUserSecret(String userSecret) {
		this.userSecret = userSecret;
	}

	@Column(name = "logname", nullable = false, length = 32)
	public String getLogname() {
		return this.logname;
	}

	public void setLogname(String logname) {
		this.logname = logname;
	}

	@Column(name = "nick_name", length = 32)
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Column(name = "is_lock")
	public Integer getIsLock() {
		return this.isLock;
	}

	public void setIsLock(Integer isLock) {
		this.isLock = isLock;
	}

	@Column(name = "is_push_like")
	public Integer getIsPushLike() {
		return this.isPushLike;
	}

	public void setIsPushLike(Integer isPushLike) {
		this.isPushLike = isPushLike;
	}

	@Column(name = "is_push_comments")
	public Integer getIsPushComments() {
		return this.isPushComments;
	}

	public void setIsPushComments(Integer isPushComments) {
		this.isPushComments = isPushComments;
	}

	@Column(name = "is_push_follow")
	public Integer getIsPushFollow() {
		return this.isPushFollow;
	}

	public void setIsPushFollow(Integer isPushFollow) {
		this.isPushFollow = isPushFollow;
	}

	@Column(name = "status", nullable = false)
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "randomKey", nullable = false, length = 32)
	public String getRandomKey() {
		return this.randomKey;
	}

	public void setRandomKey(String randomKey) {
		this.randomKey = randomKey;
	}

	@Column(name = "password", nullable = false, length = 32)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "telephone")
	public Long getTelephone() {
		return this.telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	@Column(name = "email", length = 128)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "fans_count")
	public Integer getFansCount() {
		return this.fansCount;
	}

	public void setFansCount(Integer fansCount) {
		this.fansCount = fansCount;
	}

	@Column(name = "at_count")
	public Integer getAtCount() {
		return this.atCount;
	}

	public void setAtCount(Integer atCount) {
		this.atCount = atCount;
	}

	@Column(name = "follow_count")
	public Integer getFollowCount() {
		return this.followCount;
	}

	public void setFollowCount(Integer followCount) {
		this.followCount = followCount;
	}

	@Column(name = "friend_count")
	public Integer getFriendCount() {
		return this.friendCount;
	}

	public void setFriendCount(Integer friendCount) {
		this.friendCount = friendCount;
	}

	@Column(name = "comment_count")
	public Integer getCommentCount() {
		return this.commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}


	@Column(name = "score_count")
	public Integer getScoreCount() {
		return this.scoreCount;
	}

	public void setScoreCount(Integer scoreCount) {
		this.scoreCount = scoreCount;
	}
	
	
	@Column(name = "baidu_channel_id_user_id", length = 64)
	public String getBaiduChannelIdUserId() {
		return baiduChannelIdUserId;
	}

	public void setBaiduChannelIdUserId(String baiduChannelIdUserId) {
		this.baiduChannelIdUserId = baiduChannelIdUserId;
	}

	@Column(name = "is_identification", length = 64)
	public Integer getIsIdentification() {
		return isIdentification;
	}

	public void setIsIdentification(Integer isIdentification) {
		this.isIdentification = isIdentification;
	}


	@Column(name = "hy_id_set_count", nullable = false)
	public Integer getHyIdSetCount() {
		return this.hyIdSetCount;
	}

	public void setHyIdSetCount(Integer hyIdSetCount) {
		this.hyIdSetCount = hyIdSetCount;
	}

	@Column(name = "user_header_portrait", length = 128)
	public String getUserHeaderPortrait() {
		return this.userHeaderPortrait;
	}

	public void setUserHeaderPortrait(String userHeaderPortrait) {
		this.userHeaderPortrait = userHeaderPortrait;
	}


	@Column(name = "background_pic", length = 128)
	public String getBackgroundPic() {
		return this.backgroundPic;
	}

	public void setBackgroundPic(String backgroundPic) {
		this.backgroundPic = backgroundPic;
	}

	@Column(name = "location", length = 256)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "latitude", length = 25)
	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Column(name = "longitude", length = 25)
	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Column(name = "is_show_location", nullable = false)
	public Integer getIsShowLocation() {
		return this.isShowLocation;
	}

	public void setIsShowLocation(Integer isShowLocation) {
		this.isShowLocation = isShowLocation;
	}

	@Column(name = "`desc`", length = 512)
	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Column(name = "label_info1", length = 128)
	public String getLabelInfo1() {
		return this.labelInfo1;
	}

	public void setLabelInfo1(String labelInfo1) {
		this.labelInfo1 = labelInfo1;
	}

	@Column(name = "label_info2", length = 256)
	public String getLabelInfo2() {
		return this.labelInfo2;
	}

	public void setLabelInfo2(String labelInfo2) {
		this.labelInfo2 = labelInfo2;
	}

	@Column(name = "identity")
	public Integer getIdentity() {
		return this.identity;
	}

	public void setIdentity(Integer identity) {
		this.identity = identity;
	}

	@Column(name = "gender")
	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}


	@Column(name = "open_access_level")
	public Integer getOpenAccessLevel() {
		return this.openAccessLevel;
	}

	public void setOpenAccessLevel(Integer openAccessLevel) {
		this.openAccessLevel = openAccessLevel;
	}


	@Column(name = "last_login_platform")
	public Integer getLastLoginPlatform() {
		return this.lastLoginPlatform;
	}

	public void setLastLoginPlatform(Integer lastLoginPlatform) {
		this.lastLoginPlatform = lastLoginPlatform;
	}

	@Column(name = "last_login_time", length = 19)
	public Timestamp getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	@Column(name = "create_time", length = 19)
	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Column(name = "update_time", length = 19)
	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "platform")
	public Integer getPlatform() {
		return this.platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}

	@Column(name = "app_version", length = 10)
	public String getAppVersion() {
		return this.appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	@Column(name = "app_version_update_time")
	public Long getAppVersionUpdateTime() {
		return this.appVersionUpdateTime;
	}

	public void setAppVersionUpdateTime(Long appVersionUpdateTime) {
		this.appVersionUpdateTime = appVersionUpdateTime;
	}

	@Column(name = "last_logout_time")
	public Long getLastLogoutTime() {
		return this.lastLogoutTime;
	}

	public void setLastLogoutTime(Long lastLogoutTime) {
		this.lastLogoutTime = lastLogoutTime;
	}

}