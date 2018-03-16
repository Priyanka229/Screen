package com.example.noone.screens;

import com.google.gson.annotations.SerializedName;

public class ListItem {
    @SerializedName("name")
    String titlename;
    @SerializedName("desc")
    private String desc;
    @SerializedName("url")
    private String img;
    @SerializedName("color")
    private String backColor;

    public ListItem (String title, String url, String description, String bcolor) {
        this.titlename = title;
        this.img = url;
        this.desc = description;
        this.backColor = bcolor;
    }
    public ListItem (){

    }

    public String getTitlename(){
        return titlename;
    }
    public void setTitlename(String titlename){
        this.titlename = titlename;
    }

    public String  getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBackColor() {
        return backColor;
    }

    public void setBackColor(String backColor) {
        this.backColor = backColor;
    }
}
