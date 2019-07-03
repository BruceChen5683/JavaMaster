package com.cjl.pattern.prototype.actualcombat;

public class LoginSession {
    static LoginSession loginSession = null;
    private User user;

    public LoginSession(){

    }

    public static LoginSession getInstance(){
        if(loginSession == null){
            loginSession = new LoginSession();
        }
        return loginSession;
    }

    public User getUser() {
        return user.clone();
    }

    void setUser(User user) {
        this.user = user;
    }
}
