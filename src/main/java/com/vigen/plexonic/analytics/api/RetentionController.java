package com.vigen.plexonic.analytics.api;

import com.vigen.plexonic.analytics.api.data.user.visit.UserVisit;
import com.vigen.plexonic.analytics.api.data.user.visit.UserVisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetentionController {

    @Autowired
    private UserVisitRepository userVisitRepository;

    @RequestMapping(value = "/retention", produces = "application/json")
    public @ResponseBody
    Iterable<UserVisit> getAllUsers() {
        return userVisitRepository.findAll();
    }
}
