package com.example.aninterface;

public class all {
    int title ;
    int imageResource ;

    String price ;
    public all(int title , int imageResource  , String price){
        this.title  = title;
        this.imageResource =imageResource;

        this.price = price ;
    }

    public int getTitle() { return title; }
    public int getImage() { return imageResource; }

    public String getPrice() { return price; }
}
