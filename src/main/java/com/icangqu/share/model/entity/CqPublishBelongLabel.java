package com.icangqu.share.model.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@org.hibernate.annotations.Entity(dynamicInsert = true)
@Table(name = "cq_publish_belong_label", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class CqPublishBelongLabel implements java.io.Serializable {

    // Fields

    private Integer id;
    private Integer publishId;
    private Integer labelId;
    private Date createDatetime;

    // Constructors

    /**
     * default constructor
     */
    public CqPublishBelongLabel() {
    }

    /**
     * full constructor
     */
    public CqPublishBelongLabel(Integer id, Integer publishId, Integer labelId, Date createDatetime) {
        this.id = id;
        this.publishId = publishId;
        this.labelId = labelId;
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

    @Column(name = "label_id")
    public Integer getLabelId() {
        return this.labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    @Column(name = "create_datetime")
    public Date getCreateDatetime() {
        return this.createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }
}