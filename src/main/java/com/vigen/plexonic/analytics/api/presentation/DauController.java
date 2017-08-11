package com.vigen.plexonic.analytics.api.presentation;

import com.vigen.plexonic.analytics.api.data.user.visit.UserVisit;
import com.vigen.plexonic.analytics.api.service.dau.DauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class DauController {

    @Autowired
    private DauService dauService;

    @RequestMapping(
            value = "/dau",
            method = RequestMethod.POST,
            produces = "application/json",
            params = "dates"
    )
    public @ResponseBody
    Iterable<UserVisit> dailyActiveUsers(
            @RequestParam("dates") @DateTimeFormat(pattern = "dd/MM/yyyy") Date[] dates
    ) {
        return dauService.getDailyActiveUsers(dates);
    }
}
