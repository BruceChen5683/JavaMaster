package com.cjl.servlet.ticket;

/**
 * Created by chenjianliang on 2017/7/12.
 */
public class AdminInfo {
    private String name;
    private String password;


    public AdminInfo(){

    }

    public AdminInfo(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AdminInfo{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return toString().equals(obj.toString());
    }
}
