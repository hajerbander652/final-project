package com.example.tales;

import java.io.Serializable;

public class legends implements Serializable {
    private String name;
    private int image;
    private int image2;
    private String desc;

    public legends(String name, int image, int image2, String desc) {
        this.name = name;
        this.image = image;
        this.image2 = image2;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}