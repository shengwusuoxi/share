package com.icangqu.share.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@org.hibernate.annotations.Entity(dynamicInsert = true)
@Table(name = "cq_publish", uniqueConstraints = @UniqueConstraint(columnNames = "publish_id"))
public class CqPublish implements java.io.Serializable {

    // Fields

    private Integer publishId;
    private Integer userId;
    private String location;
    private Date createDatetime;
    private Date updateTime;
    private Integer commentCount;
    private Integer viewCount;
    private Integer expertAdviceCount;
    private String description;
    private Integer goodView;
    private Integer badView;
    private String longitude;
    private String latitude;
    private Integer status;
    private Integer credit;

    // Constructors

    /**
     * default constructor
     */
    public CqPublish() {
    }

    /**
     * full constructor
     */
    public CqPublish(Integer publishId, Integer userId, String location, Date createDatetime, Integer commentCount,
                     Integer viewCount, Integer expertAdviceCount, String description, Integer goodView, Integer badView, String longitude, String latitude) {
        this.publishId = publishId;
        this.userId = userId;
        this.location = location;
        this.createDatetime = createDatetime;
        this.commentCount = commentCount;
        this.viewCount = viewCount;
        this.expertAdviceCount = expertAdviceCount;
        this.description = description;
        this.goodView = goodView;
        this.badView = badView;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    // Property accessors
    @Id
	@GeneratedValue
	@Column(name = "publish_id", unique = true, nullable = false)
    public Integer getPublishId() {
        return this.publishId;
    }

    public void setPublishId(Integer publishId) {
        this.publishId = publishId;
    }

    @Column(name = "user_id")
    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Column(name = "location")
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Column(name = "create_datetime")
    public Date getCreateDatetime() {
        return this.createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    @Column(name = "comment_count")
    public Integer getCommentCount() {
        return this.commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    @Column(name = "expert_advice_count")
    public Integer getExpertAdviceCount() {
        return this.expertAdviceCount;
    }

    public void setExpertAdviceCount(Integer expertAdviceCount) {
        this.expertAdviceCount = expertAdviceCount;
    }

    @Column(name = "description")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "good_view")
    public Integer getGoodView() {
        return this.goodView;
    }

    public void setGoodView(Integer goodView) {
        this.goodView = goodView;
    }

    @Column(name = "bad_view")
    public Integer getBadView() {
        return this.badView;
    }

    public void setBadView(Integer badView) {
        this.badView = badView;
    }

    @Column(name = "longitude")
    public String getLongitude() {
        return this.longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Column(name = "latitude")
    public String getLatitude() {
        return this.latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Column(name = "view_count")
    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    @Column(name = "update_time")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Column(name = "credit")
    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }
}