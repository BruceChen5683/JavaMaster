package com.cjl.io.source;

import java.io.*;
import java.util.*;

public class TextFile extends ArrayList<String>{
    //: net/mindview/util/TextFile.java
    // Static functions for reading and writing text files as
    // a single string, and treating a file as an ArrayList.
        // Read a file as a single string:
        public static String read(String fileName) {
            StringBuilder sb = new StringBuilder();
            try {
                BufferedReader in= new BufferedReader(new FileReader(
                        new File(fileName).getAbsoluteFile()));
                try {
                    String s;
                    while((s = in.readLine()) != null) {
                        sb.append(s);
                        sb.append("\n");//???难道读出来的不包括这一个吗？
                    }
                } finally {
                    in.close();
                }
            } catch(IOException e) {
                throw new RuntimeException(e);
            }
            return sb.toString();
        }
        // Write a single file in one method call:
        public static void write(String fileName, String text) {
            try {
                PrintWriter out = new PrintWriter(
                        new File(fileName).getAbsoluteFile());
                try {
                    out.print(text);
                } finally {
                    out.close();
                }
            } catch(IOException e) {
                throw new RuntimeException(e);
            }
        }
        // Read a file, split by any regular expression:
        public TextFile(String fileName, String splitter) {
            super(Arrays.asList(read(fileName).split(splitter)));
            // Regular expression split() often leaves an empty
            // String at the first position:
            if(get(0).equals("")) remove(0);
        }
        // Normally read by lines:
        public TextFile(String fileName) {
            this(fileName, "\n");
        }
        public void write(String fileName) {
            try {
                PrintWriter out = new PrintWriter(
                        new File(fileName).getAbsoluteFile());
                try {
                    for(String item : this)
                        out.println(item);
                } finally {
                    out.close();
                }
            } catch(IOException e) {
                throw new RuntimeException(e);
            }
        }
        // Simple test:
        public static void main(String[] args) {
            String file = read("io/src/source/TextFile.java");
            write("test.txt", file);
            TextFile text = new TextFile("test.txt");
            text.write("test2.txt");
            // Break into unique sorted list of words:
            TreeSet<String> words = new TreeSet<String>(
                    new TextFile("io/src/source/TextFile.java", "\\W+"));
            // Display the capitalized words:
            System.out.println(words.headSet("a"));



//            String test = read("c.c");
//            System.out.println("TextFile.main "+test);
//
//            write("temp_file","abc\n c");
//
//
//            System.out.println("TextFile.main"+new TextFile("c.c"));
//
//            System.out.println("TextFile.main"+new TextFile("c.c","2"));
//            for (String s:
//                    new TextFile("c.c","2")) {
//                System.out.println("TextFile.main :"+s);
//            }

        }/* Output:
    [0, ArrayList, Arrays, Break, BufferedReader, BufferedWriter, Clean, Display, File, FileReader, FileWriter, IOException, Normally, Output, PrintWriter, Read, Regular, RuntimeException, Simple, Static, String, StringBuilder, System, TextFile, Tools, TreeSet, W, Write]
    *///:~
}
