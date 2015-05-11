package com.icangqu.share.dao.impl.support;

/**
 * Created by IntelliJ IDEA.
 * User: root
 * Date: 2010-7-1
 * Time: 9:38:39
 */
public class SimpleRange implements Range {
    private Object fromValue;
    private Object toValue;
    private LType toType;
    private GType fromType;

    public SimpleRange(Object fromValue, Object toValue) {
        this(fromValue, toValue, Range.GType.gt, Range.LType.lt);
    }

    public SimpleRange(Object fromValue, Object toValue, GType fromType, LType toType) {
        this.fromValue = fromValue;
        this.toValue = toValue;
        this.toType = toType;
        this.fromType = fromType;
        if (this.fromType == null) this.fromType = Range.GType.gt;
        if (this.toType == null) this.toType = Range.LType.lt;
    }

    @Override
    public Object getFromValue() {
        return this.fromValue;
    }

    @Override
    public Object getToValue() {
        return this.toValue;
    }

    @Override
    public GType getFromType() {
        return this.fromType;
    }

    @Override
    public LType getToType() {
        return this.toType;
    }
}
