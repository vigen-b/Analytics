package com.vigen.plexonic.analytics.api;

import com.vigen.plexonic.analytics.api.data.user.visit.UserVisit;
import com.vigen.plexonic.analytics.api.data.user.visit.UserVisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class RetentionController {

    @Autowired
    private UserVisitRepository userVisitRepository;

    @RequestMapping(
            value = "/retention",
            method = RequestMethod.POST,
            produces = "application/json",
            params = "dates"
    )
    public @ResponseBody
    Iterable<UserVisit> getAllUsers(
            @RequestParam("dates") @DateTimeFormat(pattern="dd/MM/yyyy") Date[] dates) {
        return userVisitRepository.findAll();
    }
}
