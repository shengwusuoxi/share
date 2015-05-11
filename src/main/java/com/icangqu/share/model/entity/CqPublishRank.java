package com.icangqu.share.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@org.hibernate.annotations.Entity(dynamicInsert = true)
@Table(name = "cq_publish_rank", uniqueConstraints = @UniqueConstraint(columnNames = "publish_id"))
public class CqPublishRank implements java.io.Serializable {

    // Fields

    private Integer publishId;

    // Constructors

    /**
     * default constructor
     */
    public CqPublishRank() {
    }

    /**
     * full constructor
     */
    public CqPublishRank(Integer publishId) {
        this.publishId = publishId;
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
}