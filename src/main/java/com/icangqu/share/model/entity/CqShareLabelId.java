package com.icangqu.share.model.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ShareLabelId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class CqShareLabelId implements java.io.Serializable {

	// Fields

	private Integer shareUserId;
	private Integer labelId;

	// Constructors

	/** default constructor */
	public CqShareLabelId() {
	}

	/** full constructor */
	public CqShareLabelId(Integer shareUserId, Integer labelId) {
		this.shareUserId = shareUserId;
		this.labelId = labelId;
	}

	// Property accessors

	@Column(name = "share_user_id", nullable = false)
	public Integer getShareUserId() {
		return this.shareUserId;
	}

	public void setShareUserId(Integer shareUserId) {
		this.shareUserId = shareUserId;
	}

	@Column(name = "label_id", nullable = false)
	public Integer getLabelId() {
		return this.labelId;
	}

	public void setLabelId(Integer labelId) {
		this.labelId = labelId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CqShareLabelId))
			return false;
		CqShareLabelId castOther = (CqShareLabelId) other;

		return ((this.getShareUserId() == castOther.getShareUserId()) || (this
				.getShareUserId() != null && castOther.getShareUserId() != null && this
				.getShareUserId().equals(castOther.getShareUserId())))
				&& ((this.getLabelId() == castOther.getLabelId()) || (this
						.getLabelId() != null && castOther.getLabelId() != null && this
						.getLabelId().equals(castOther.getLabelId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getShareUserId() == null ? 0 : this.getShareUserId()
						.hashCode());
		result = 37 * result
				+ (getLabelId() == null ? 0 : this.getLabelId().hashCode());
		return result;
	}
}