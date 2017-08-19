package com.vigen.plexonic.analytics.api.presentation;

import com.vigen.plexonic.analytics.api.data.user.RetentionType;
import com.vigen.plexonic.analytics.api.service.retention.RetentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class RetentionController {

    @Autowired
    private RetentionService retentionService;

    @RequestMapping(
            value = "/retention",
            method = RequestMethod.POST,
            produces = "application/json",
            params = {"type", "date"}
    )
    public @ResponseBody
    double calculateRetention(
            @RequestParam("type") RetentionType type,
            @RequestParam("date") @DateTimeFormat(pattern = "dd/MM/yyyy") Date date) {
        return retentionService.calculateRetention(type, date);
    }
}
