package com.aolei.bootdata.service.impl;

import com.aolei.bootdata.dao.UserMapper;
import com.aolei.bootdata.entity.User;
import com.aolei.bootdata.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by debug on 2017/6/16.
 * E-mail aolei807648567@gmail.com
 */
@Service("IUserService")
public class IUserServiceImpl implements IUserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserById(int id) {
        User user = userMapper.selectById(id);
        return user;
    }
}
