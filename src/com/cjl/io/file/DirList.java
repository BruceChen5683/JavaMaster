package com.cjl.io.file;

import java.io.File;
import java.util.Arrays;

public class DirList {
    public static void mylist(String path){
        File file = new File(path);
        if (file.isDirectory()){
            for (String fileName:file.list()){
                if(isJava(fileName)){
                    System.out.println("DirList.mylist "+fileName);
                }
            }

        }else {
            System.out.println("DirList.mylist "+file.getAbsolutePath());
            System.out.println("DirList.mylist not dir");
        }
    }

    public static void tkList(String path,String regex){
        File file = new File(path);
        String[] list;
        if (regex.length() == 0){
            list = file.list();
        }else {
            list = file.list(new DirFilter(regex));
        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);

        for (String stringItem:list){
            System.out.println("DirList.tkList "+stringItem);
        }
    }



    public static boolean isJava(String s){
        if (s == null || s.length() == 0){
            return false;
        }
        if (s.endsWith(".java")){
            return true;
        }
        return false;
    }
}
