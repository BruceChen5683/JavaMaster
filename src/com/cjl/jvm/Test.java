package com.cjl.jvm;

import com.cjl.jvm.serializable.User;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) {
        User user = new User("",1);
        File file = new File("user.txt");

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(user);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
