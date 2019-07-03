package com.cjl.pattern.prototype;

import java.util.ArrayList;

public class Book implements Cloneable{
    private String title;
    private ArrayList<String> image = new ArrayList<>();

    public Book(){
        super();
    }
//
//    @Override
//    protected Book clone(){
//        try {
//            Book book = (Book) super.clone();
//            return book;
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    @Override
    protected Book clone(){
        try {
            Book book = (Book) super.clone();
            book.image = (ArrayList<String>) this.image.clone();
            return book;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getImage() {
        return image;
    }

    public void addImage(String image) {
        this.image.add(image);
    }

    /**
     * 打印内容
     */
    public void showBook() {
        System.out.println("----------------------Start----------------------");

        System.out.println("title：" + title);
        for (String img : image) {
            System.out.println("image name:" + img);
        }

        System.out.println("----------------------End----------------------");
    }
}
