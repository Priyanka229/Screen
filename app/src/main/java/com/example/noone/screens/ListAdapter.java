package com.example.noone.screens;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.List;

public class ListAdapter extends FragmentPagerAdapter {

    List<ListItem> listItemList;
    public ListAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public int getCount() {
        return listItemList.size();
    }

    @Override
    public Fragment getItem(int position) {
       // ListItemFragment listItemFragment = new ListItemFragment(listItemList.get(position));
        ListItemFragment listItemFragment = new ListItemFragment();
        listItemFragment.listItem = listItemList.get(position);
        return listItemFragment;
    }

}
