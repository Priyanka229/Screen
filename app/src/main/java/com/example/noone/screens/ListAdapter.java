package com.example.noone.screens;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;

import java.util.List;

/**
 * Created by noone on 28/2/18.
 */

public class ListAdapter extends PagerAdapter {
    private Context context;
    private List<ListItem> listItemList;
    private LayoutInflater layoutInflater;

    public ListAdapter(Context context , List<ListItem> listItems){
        this.context = context;
        this.layoutInflater = (LayoutInflater) this.context.getSystemService(this.context.LAYOUT_INFLATER_SERVICE);
        this.listItemList = listItems;

    }

    @Override
    public int getCount() {
        return listItemList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
