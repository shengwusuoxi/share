package com.icangqu.share.model.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@org.hibernate.annotations.Entity(dynamicInsert = true)
@Table(name = "cq_label", uniqueConstraints = @UniqueConstraint(columnNames = "label_id"))
public class CqLabel implements java.io.Serializable {

	// Fields

	private Integer labelId;
    private String labelName;
    private String labelDesc;
    private String labelCoverUrl;
    // 标签类型
    private Integer labelType;
    private Date createDatetime;
    private Date updateDatetime;
    private Integer creatorId;
    private Integer credit;
    /**
     * 1:normal  0:expire
     */
    private Integer status;
    private Integer publishCount;

	// Constructors

	/** default constructor */
	public CqLabel() {
	}


	/** full constructor */
	public CqLabel(Integer labelId, String labelName, String labelDesc, String labelCoverUrl, Integer labelType, Date createDatetime, Date updateDatetime, Integer creatorId, Integer credit, Integer status, Integer publishCount) {
        this.labelId = labelId;
        this.labelName = labelName;
        this.labelDesc = labelDesc;
        this.labelCoverUrl = labelCoverUrl;
        this.labelType = labelType;
        this.createDatetime = createDatetime;
        this.updateDatetime = updateDatetime;
        this.creatorId = creatorId;
        this.credit = credit;
        this.status = status;
        this.publishCount = publishCount;
    }

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "label_id", unique = true, nullable = false)
	public Integer getLabelId() {
		return this.labelId;
	}

	public void setLabelId(Integer labelId) {
		this.labelId = labelId;
	}

	@Column(name = "label_name", unique = true, nullable = false, length = 20)
	public String getLabelName() {
		return this.labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	@Column(name = "label_desc")
	public String getLabelDesc() {
		return this.labelDesc;
	}

	public void setLabelDesc(String labelDesc) {
		this.labelDesc = labelDesc;
	}

	@Column(name = "label_cover_url")
	public String getLabelCoverUrl() {
		return this.labelCoverUrl;
	}

	public void setLabelCoverUrl(String labelCoverUrl) {
		this.labelCoverUrl = labelCoverUrl;
	}

	@Column(name = "label_type")
	public Integer getLabelType() {
		return this.labelType;
	}

	public void setLabelType(Integer labelType) {
		this.labelType = labelType;
	}

	@Column(name = "create_datetime")
	public Date getCreateDatetime() {
		return this.createDatetime;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	@Column(name = "update_datetime")
	public Date getUpdateDatetime() {
		return this.updateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	@Column(name = "creator_id")
	public Integer getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}

	@Column(name = "credit")
	public Integer getCredit() {
		return this.credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	@Column(name = "publish_count")
	public Integer getPublishCount() {
		return this.publishCount;
	}

	public void setPublishCount(Integer publishCount) {
		this.publishCount = publishCount;
	}
	
	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}