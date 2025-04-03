package com.example.aninterface;

public class all {
    String title ;
    int imageResource ;

    String price ;
    public all(String title , int imageResource  , String price){
        this.title  = title;
        this.imageResource =imageResource;

        this.price = price ;
    }

    public String getTitle() { return title; }
    public int getImage() { return imageResource; }

    public String getPrice() { return price; }
}
