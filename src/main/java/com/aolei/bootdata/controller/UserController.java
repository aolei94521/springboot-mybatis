package com.aolei.bootdata.controller;

import com.aolei.bootdata.entity.User;
import com.aolei.bootdata.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by debug on 2017/6/16.
 * E-mail aolei807648567@gmail.com
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/{id}")
    public User getUserById(@PathVariable("id")Integer id){
        System.out.println("AOLEIDEBUG============="+id);
        User user = userService.getUserById(id);
        System.out.println("AOLEIDEBUG================="+user.toString());
        return user;
    }
}
