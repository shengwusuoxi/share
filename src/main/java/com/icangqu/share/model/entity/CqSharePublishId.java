package com.icangqu.share.model.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SharePublishId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class CqSharePublishId implements java.io.Serializable {

	// Fields

	private Integer shareUserId;
	private Integer publishId;

	// Constructors

	/** default constructor */
	public CqSharePublishId() {
	}

	/** full constructor */
	public CqSharePublishId(Integer shareUserId, Integer publishId) {
		this.shareUserId = shareUserId;
		this.publishId = publishId;
	}

	// Property accessors

	@Column(name = "share_user_id", nullable = false)
	public Integer getShareUserId() {
		return this.shareUserId;
	}

	public void setShareUserId(Integer shareUserId) {
		this.shareUserId = shareUserId;
	}

	@Column(name = "publish_id", nullable = false)
	public Integer getPublishId() {
		return this.publishId;
	}

	public void setPublishId(Integer publishId) {
		this.publishId = publishId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CqSharePublishId))
			return false;
		CqSharePublishId castOther = (CqSharePublishId) other;

		return ((this.getShareUserId() == castOther.getShareUserId()) || (this
				.getShareUserId() != null && castOther.getShareUserId() != null && this
				.getShareUserId().equals(castOther.getShareUserId())))
				&& ((this.getPublishId() == castOther.getPublishId()) || (this
						.getPublishId() != null && castOther.getPublishId() != null && this
						.getPublishId().equals(castOther.getPublishId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getShareUserId() == null ? 0 : this.getShareUserId()
						.hashCode());
		result = 37 * result
				+ (getPublishId() == null ? 0 : this.getPublishId().hashCode());
		return result;
	}
}