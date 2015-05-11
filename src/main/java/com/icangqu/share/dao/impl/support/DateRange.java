package com.icangqu.share.dao.impl.support;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by IntelliJ IDEA.
 * User: root
 * Date: 2010-7-1
 * Time: 2:46:03
 */
public class DateRange implements Range {
    private Date dateFrom;
    private Date dateTo;
    private LType highType;
    private GType lowType;

    public DateRange(Date dateFrom, Date dateTo) {
        this(dateFrom, Range.GType.gt, dateTo, Range.LType.lt);
    }

    public DateRange(Date dateFrom, GType lowType, Date dateTo, LType highType) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.highType = highType;
        this.lowType = lowType;
        if (this.lowType == null) this.lowType = Range.GType.gt;
        if (this.highType == null) this.highType = Range.LType.lt;
        patchDate();
    }
    
    private void patchDate(){
    	Calendar cal = GregorianCalendar.getInstance();
    	if(this.lowType == Range.GType.gt && this.dateFrom!=null){
    		cal.setTime(this.dateFrom);
    		cal.add(Calendar.DAY_OF_MONTH, 1);
    		this.dateFrom = cal.getTime();
    	}
    	if(this.highType == Range.LType.le && this.dateTo!=null){
    		cal.setTime(this.dateTo);
    		cal.add(Calendar.DAY_OF_MONTH, 1);
    		this.dateTo = cal.getTime();
    	}
    	cal = null;
    }

    @Override
    public Date getFromValue() {
        return this.dateFrom;
    }

    @Override
    public Date getToValue() {
        return this.dateTo;
    }

    @Override
    public GType getFromType() {
        return this.lowType;
    }

    @Override
    public LType getToType() {
        return this.highType;
    }
}
