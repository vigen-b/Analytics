package com.vigen.plexonic.analytics.api.utils;

import com.vigen.plexonic.analytics.api.data.user.RetentionType;

import java.util.Calendar;
import java.util.Date;

public class Util {

    public static Date addDaysToDate(int days, Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, days);
        return c.getTime();
    }

    public static Date addDaysToDate(RetentionType type, Date date) {
        return addDaysToDate(type.getValue(), date);
    }
}
