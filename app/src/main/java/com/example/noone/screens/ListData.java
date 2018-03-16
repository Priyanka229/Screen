package com.example.noone.screens;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListData {
    @SerializedName("data_list")
    List<ListItem> dataList;

    public List<ListItem> getDataList() {
        return dataList;
    }

    public void setDataList(List<ListItem> dataList) {
        this.dataList = dataList;
    }
}
