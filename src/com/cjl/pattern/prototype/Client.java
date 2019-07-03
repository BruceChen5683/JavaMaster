package com.cjl.pattern.prototype;

public class Client {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("book1");
        book1.addImage("image1");
        book1.showBook();

        Book book2 = (Book) book1.clone();
        book2.showBook();
        book2.setTitle("book2");
        book2.addImage("image2");
        book2.showBook();

        book1.showBook();
        book1.addImage("image3");
        book2.addImage("image4");

        book1.showBook();
        book2.showBook();
    }
}
