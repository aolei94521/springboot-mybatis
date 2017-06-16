package com.aolei.bootdata.test;

import com.aolei.bootdata.Application;
import com.aolei.bootdata.entity.User;
import com.aolei.bootdata.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by debug on 2017/6/16.
 * E-mail aolei807648567@gmail.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationTests {
    /*@Autowired
    private UserMapper userMapper;*/
    @Autowired
   private IUserService userService;

    @Test
    public void findByName(){
        User user = userService.getUserById(3);
        System.out.println("aoleidebug========================"+user.toString());
    }
}
