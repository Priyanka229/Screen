package com.example.noone.screens;

import android.widget.ImageView;

/**
 * Created by noone on 28/2/18.
 */

public class ListItem {
    private String titlename;
    private String desc;
    private ImageView img;

    public ListItem (String title, ImageView image, String description) {
        this.titlename = title;
        this.img = image;
        this.desc = description;
    }

    public String getTitlename(){
        return titlename;
    }
    public void setTitlename(String titlename){
        this.titlename = titlename;
    }

    public ImageView getImg() {
        return img;
    }

    public void setImg(ImageView img) {
        this.img = img;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
