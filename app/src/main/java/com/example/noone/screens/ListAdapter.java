package com.example.noone.screens;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.List;

public class ListAdapter extends FragmentPagerAdapter {

    List<ListItem> mListItemList;

    public void setDataList(List<ListItem> list) {
        this.mListItemList = list;
    }
    public ListAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public int getCount() {
        int count;
        if(mListItemList != null){
            count = mListItemList.size();
        }else {
            count = 0;
        }
        return count;
    }

    @Override
    public Fragment getItem(int position) {
       // ListItemFragment listItemFragment = new ListItemFragment(listItemList.get(position));
        ListItemFragment listItemFragment = new ListItemFragment();
        listItemFragment.listItem = mListItemList.get(position);
        return listItemFragment;
    }

}
