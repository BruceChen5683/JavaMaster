package com.cjl.pattern.prototype.actualcombat;

import sun.rmi.runtime.Log;

public class Client {
    public static void main(String[] args) {
        LoginImpl login = new LoginImpl();
        login.login();

        User tempUser = LoginSession.getInstance().getUser();

        User user = LoginSession.getInstance().getUser();
        user.address = new Address("newSh","ddd","deee");

        LoginSession.getInstance().setUser(user);

        System.out.println("Client.main" + tempUser);
        System.out.println("已登录："+LoginSession.getInstance().getUser());

    }
}
