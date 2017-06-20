package com.aolei.bootdata.exception;

/**
 * Created by debug on 2017/6/19.
 * E-mail aolei807648567@gmail.com
 */
public class ServiceException extends Exception{
    private static final Long serialVersionUID = 1L;
    public ServiceException(String msg){
        super(msg);
    }

    public ServiceException(String msg,Throwable e){
        super(msg,e);
    }
    public ServiceException(Throwable e){
        super(e);
    }
}
