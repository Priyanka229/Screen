package com.example.noone.screens;

public class ListItem {
    String titlename;
    private String desc;
    private int img;
    private String backColor;

    public ListItem (String title, int url, String description, String bcolor) {
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

    public int  getImg() {
        return img;
    }

    public void setImg(int img) {
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
