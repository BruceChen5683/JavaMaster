package com.cjl.pattern.command.actualcombat.note;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.*;
import java.util.ArrayList;

public class FileUtils {

    public static void writeCommands(ArrayList commands){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("d:\\commands.file"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(commands);
            objectOutputStream.close();
        }catch (IOException e){

        }

    }

    public static ArrayList readCommands(){
        try {
            FileInputStream fileInputStream = new FileInputStream("d:\\commands.file");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList commands = (ArrayList) objectInputStream.readObject();
            objectInputStream.close();
            return commands;
        }catch (IOException e){
            return null;
        }catch (ClassNotFoundException e){
            return null;
        }
    }
}
