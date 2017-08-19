package com.vigen.plexonic.analytics.api.service.retention;

import com.vigen.plexonic.analytics.api.data.user.RetentionType;
import com.vigen.plexonic.analytics.api.data.user.register.UserRegisterRepository;
import com.vigen.plexonic.analytics.api.data.user.visit.UserVisitRepository;
import com.vigen.plexonic.analytics.api.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class RetentionServiceImplemetation implements RetentionService {
    @Autowired
    private UserVisitRepository userVisitRepository;

    @Autowired
    private UserRegisterRepository userRegisterRepository;

    @Override
    public double calculateRetention(RetentionType type, Date date) {
        Integer count = userRegisterRepository.getRegisteredUsers(date);
        ArrayList<Integer> returnedUsers = userVisitRepository.getReturnedUsers(date, Util.addDaysToDate(type, date));

        return returnedUsers.size() / (double) count;
    }
}
