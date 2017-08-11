package com.vigen.plexonic.analytics.api.service.retention;

import com.vigen.plexonic.analytics.api.data.user.RetentionType;
import com.vigen.plexonic.analytics.api.data.user.register.UserRegisterRepository;
import com.vigen.plexonic.analytics.api.data.user.visit.UserVisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RetentionServiceImplemetation implements RetentionService {
    @Autowired
    private UserVisitRepository userVisitRepository;

    @Autowired
    private UserRegisterRepository userRegisterRepository;

    @Override
    public double calculateRetention(RetentionType type, Date date) {
       /* Date endDate = Util.addDaysToDate(type, date);
        int ce = userRegisterRepository.numberOfCustomers(endDate);
        int cn = userRegisterRepository.newCustomersDuringPeriod(date, endDate);
        int cs = userRegisterRepository.numberOfCustomers(date);
        return calculateRetention(ce, cn, cs);*/
        return 0;
    }

    private double calculateRetention(int ce, int cn, int cs) {
        return ((ce - cn) / cs) * 100;
    }
}
