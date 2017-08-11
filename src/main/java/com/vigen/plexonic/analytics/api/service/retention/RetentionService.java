package com.vigen.plexonic.analytics.api.service.retention;

import com.vigen.plexonic.analytics.api.data.user.RetentionType;

import java.util.Date;

public interface RetentionService {

    double calculateRetention(RetentionType type, Date date);
}
