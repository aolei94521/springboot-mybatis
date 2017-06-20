package com.aolei.bootdata.dao;

import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;

/**
 * Created by debug on 2017/6/19.
 * E-mail aolei807648567@gmail.com
 */
@Mapper
public interface BaseMapper <T extends Serializable,PK extends Serializable>{
     T selectById(PK id);
}
