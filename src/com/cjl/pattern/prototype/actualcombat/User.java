package com.cjl.pattern.prototype.actualcombat;

public class User implements Cloneable{
    public int age;
    public String name;
    public String phoneNum;
    public Address address;

    @Override
    protected User clone(){
        try {
            User user = (User) super.clone();
            return user;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", address=" + address +
                '}';
    }
}
