package com.icangqu.share.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@org.hibernate.annotations.Entity(dynamicInsert = true)
@Table(name = "cq_publish_include_image", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class CqPublishIncludeImage implements java.io.Serializable {

    // Fields

    private Integer id;
    private Integer publishId;
    private String imageUrl;
    private Integer userId;
    private Date createDatetime;

    // Constructors

    /**
     * default constructor
     */
    public CqPublishIncludeImage() {
    }

    /**
     * full constructor
     */
    public CqPublishIncludeImage(Integer id, Integer publishId, String imageUrl, Date createDatetime) {
        this.id = id;
        this.publishId = publishId;
        this.imageUrl = imageUrl;
        this.createDatetime = createDatetime;
    }

    // Property accessors
    @Id
   	@GeneratedValue
   	@Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "publish_id")
    public Integer getPublishId() {
        return this.publishId;
    }

    public void setPublishId(Integer publishId) {
        this.publishId = publishId;
    }

    @Column(name = "image_url")
    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Column(name = "create_datetime")
    public Date getCreateDatetime() {
        return this.createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}