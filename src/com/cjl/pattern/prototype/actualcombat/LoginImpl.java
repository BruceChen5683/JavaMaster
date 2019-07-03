package com.cjl.pattern.prototype.actualcombat;

public class LoginImpl implements Login{
    @Override
    public void login() {
        User user = new User();

        user.age = 22;
        user.name = "cjl";
        user.address = new Address("sh","pd","1002");

        LoginSession.getInstance().setUser(user);
    }
}
