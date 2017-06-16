package com.aolei.bootdata.entity;

import java.io.Serializable;

/**
 * Created by debug on 2017/6/16.
 * E-mail aolei807648567@gmail.com
 */
public class User implements Serializable{

    private int id;
    private String userName;
    private String userPwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public User(int id, String userName, String userPwd) {
        this.id = id;
        this.userName = userName;
        this.userPwd = userPwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }

    public User() {
    }
}
