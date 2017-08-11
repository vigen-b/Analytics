package com.vigen.plexonic.analytics.api.service.dau;

import com.vigen.plexonic.analytics.api.data.user.visit.UserVisit;
import com.vigen.plexonic.analytics.api.data.user.visit.UserVisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DauServiceImplementation implements DauService {

    @Autowired
    private UserVisitRepository userVisitRepository;

    @Override
    public Iterable<UserVisit> getDailyActiveUsers(Date[] dates) {
        return userVisitRepository.getDailyActiveUsers(dates);
    }
}
