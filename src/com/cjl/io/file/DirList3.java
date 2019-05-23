package com.cjl.io.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;

public class DirList3 {
    public static void main(String[] args) {
        String[] list;
        File file = new File("/personal_pro/Java");
        final String regex = ".java";
        list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return Pattern.compile(regex).matcher(name).find();
            }
        });
        Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println("DirList3.compare o1  "+o1);
                System.out.println("DirList3.compare o2    "+o2);
                System.out.println("DirList3.compare "+o1.compareTo(o2));
                if (o1.compareTo(o2) >= 0){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        for (String s :list){
            System.out.println("DirList2.main "+s);
        }
    }
}
