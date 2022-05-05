package com.example.myapplication;

public class VerticalModel {
    String verticalname, verticaldescription;
    int image;


    public VerticalModel(String verticalname, String verticaldescription, int image) {
        this.verticalname = verticalname;
        this.verticaldescription = verticaldescription;
        this.image = image;
    }

    public String getVerticalname() {
        return verticalname;
    }

    public String getVerticaldescription() {
        return verticaldescription;
    }

    public int getImage() {
        return image;
    }
}
