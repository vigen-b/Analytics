package com.vigen.plexonic.analytics.api.service;

import com.vigen.plexonic.analytics.api.data.user.visit.UserVisit;

import java.util.Date;

public interface DauService {

    Iterable<UserVisit> getDailyActiveUsers(Date[] dates);
}
