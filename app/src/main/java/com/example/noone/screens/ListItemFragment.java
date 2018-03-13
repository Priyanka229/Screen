package com.example.noone.screens;


import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ListItemFragment extends Fragment {

    ListItem listItem;

//    public ListItemFragment (ListItem listItem) {
//
//    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(getView() != null){
            TextView title = getView().findViewById(R.id.title_tv);
            ImageView img = getView().findViewById(R.id.img);
            TextView desc = getView().findViewById(R.id.desc_tv);
            RelativeLayout bcolor = getView().findViewById(R.id.layout);


            title.setText(listItem.getTitlename());
            img.setBackgroundResource(listItem.getImg());
            desc.setText(listItem.getDesc());
            bcolor.setBackgroundColor(Color.parseColor(listItem.getBackColor()));
        }
    }
}
