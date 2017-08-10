package com.vigen.plexonic.analytics.api;

import com.vigen.plexonic.analytics.api.service.DauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class DailyActiveUsersController {

    @Autowired
    private DauService dauService;

    @RequestMapping(
            value = "/dau",
            method = RequestMethod.POST,
            produces = "application/json",
            params = "dates"
    )
    public @ResponseBody Integer getAllUsers(
            @RequestParam("dates") @DateTimeFormat(pattern="dd/MM/yyyy") Date[] dates
    ) {
        return dauService.getDailyActiveUsers(dates);
    }
}
