package com.cjl.servlet.session;

/**
 * Created by chenjianliang on 2017/8/2.
 */
public class User {
    private String username;
    private String password;
    private String authoority;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthoority() {
        return authoority;
    }

    public void setAuthoority(String authoority) {
        this.authoority = authoority;
    }
}

