package com.aolei.bootdata.dao;

import com.aolei.bootdata.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by debug on 2017/6/16.
 * E-mail aolei807648567@gmail.com
 */
@Mapper
public interface UserMapper {
    //@Select("select * from tb_user where id = #{id}")
    User selectById(@Param(value = "id") Integer id);
}
