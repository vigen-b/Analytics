package com.vigen.plexonic.analytics.api;

import com.vigen.plexonic.analytics.api.data.user.register.UserRegister;
import com.vigen.plexonic.analytics.api.data.user.register.UserRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DailyActiveUsersController {

    @Autowired
    private UserRegisterRepository userRegisterRepository;

    @RequestMapping("/all")
    public @ResponseBody Iterable<UserRegister> getAllUsers() {
        return userRegisterRepository.findAll();
    }
}
