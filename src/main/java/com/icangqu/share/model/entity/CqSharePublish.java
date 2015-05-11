package com.icangqu.share.model.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * SharePublish entity. @author MyEclipse Persistence Tools
 */
@Entity
@org.hibernate.annotations.Entity(dynamicInsert = true)
@Table(name = "cq_share_publish", uniqueConstraints = @UniqueConstraint(columnNames = "share_id"))
public class CqSharePublish implements java.io.Serializable {

	// Fields

	private CqSharePublishId id;
	private String shareId;
	private Integer status;
	private Long addTime;
	private Long updTime;

	// Constructors

	/** default constructor */
	public CqSharePublish() {
	}

	/** minimal constructor */
	public CqSharePublish(CqSharePublishId id, String shareId,
			Integer status, Long addTime) {
		this.id = id;
		this.shareId = shareId;
		this.status = status;
		this.addTime = addTime;
	}

	/** full constructor */
	public CqSharePublish(CqSharePublishId id, String shareId,
			Integer status, Long addTime, Long updTime) {
		this.id = id;
		this.shareId = shareId;
		this.status = status;
		this.addTime = addTime;
		this.updTime = updTime;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "shareUserId", column = @Column(name = "share_user_id", nullable = false)),
			@AttributeOverride(name = "publishId", column = @Column(name = "publish_id", nullable = false)) })
	public CqSharePublishId getId() {
		return this.id;
	}

	public void setId(CqSharePublishId id) {
		this.id = id;
	}

	@Column(name = "share_id", unique = true, nullable = false, length = 43)
	public String getShareId() {
		return this.shareId;
	}

	public void setShareId(String shareId) {
		this.shareId = shareId;
	}

	@Column(name = "status", nullable = false)
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "add_time", nullable = false)
	public Long getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Long addTime) {
		this.addTime = addTime;
	}

	@Column(name = "upd_time")
	public Long getUpdTime() {
		return this.updTime;
	}

	public void setUpdTime(Long updTime) {
		this.updTime = updTime;
	}
}