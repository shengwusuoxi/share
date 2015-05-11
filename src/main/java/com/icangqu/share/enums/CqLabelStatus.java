package com.icangqu.share.enums;

/**
 * Created by doer on 2015/4/14.
 */
public enum CqLabelStatus {

    expire_status(0),

    /**
     * 普通标签
     */
    normal_status(1);

    public final Integer val;

    private CqLabelStatus(Integer val) {
        this.val = val;
    }
}
