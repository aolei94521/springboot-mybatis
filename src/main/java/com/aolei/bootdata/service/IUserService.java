package com.aolei.bootdata.service;

import com.aolei.bootdata.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by debug on 2017/6/16.
 * E-mail aolei807648567@gmail.com
 */
@Service
public interface IUserService {
    User getUserById(int id);
}
