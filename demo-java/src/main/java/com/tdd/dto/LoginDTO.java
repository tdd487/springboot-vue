package com.tdd.dto;

/**
 * @Author: tdd
 * @Date: 2021/2/3
 * @Description:
 **/

public class LoginDTO {
    private String loginName;
    private String password;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
