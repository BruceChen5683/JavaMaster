package com.cjl.io.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class DirList2 {
    /**
     * 匿名内部类
     * final 使用类之外的对象
     * @param regex
     * @return
     */
    public static FilenameFilter filter(final String regex){
        return new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                Pattern pattern = Pattern.compile(regex);
                return pattern.matcher(name).find();
            }
        };
    }

    public static void main(String[] args) {
        String[] list;
        File file = new File("/personal_pro/Java");
        list = file.list(filter(".java"));
        for (String s :list){
            System.out.println("DirList2.main "+s);
        }
    }
}
