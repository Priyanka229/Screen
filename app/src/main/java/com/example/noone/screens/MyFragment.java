package com.example.noone.screens;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MyFragment extends Fragment {

    ListAdapter mListAdapter;

    List<ListItem> listItemList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listItemList = new ArrayList<>();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ViewPager viewPager = view.findViewById(R.id.view_pager);

//        ListItem listItem = new ListItem();
//        listItem.titlename = "Daily Workout";
//        listItem.setImg(R.drawable.exercise);
//        listItem.setDesc("Set your daily workout routine by the help of trainer");
//        listItem.setBackColor("#f4b241");
//        listItemList.add(listItem);
//
//        listItemList.add(new ListItem("Meditation Techniques", R.drawable.meditation, "Learn about the different meditation techniques and practice them", "#16bc7d"));

        mListAdapter = new ListAdapter(getChildFragmentManager());
       // mListAdapter.listItemList = listItemList;
        viewPager.setAdapter(mListAdapter);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        makeApiCall();
    }

    private void makeApiCall(){
        Call<ListData> call = ListItemClient.getListOfItemApi().getList();
        call.enqueue(new Callback<ListData>() {
            @Override
            public void onResponse(Call<ListData> call, Response<ListData> response) {
//                ListData listData = response.body();
//                for (int i = 0; i < listData.dataList.size(); i++) {
//                    System.out.println(listData.getDataList().get(i).getTitlename());
//                }
                sendDataToAdapter(response.body().dataList);

            }

            @Override
            public void onFailure(Call<ListData> call, Throwable t) {
                System.out.println("error");
            }
        });
    }

    private void sendDataToAdapter (List<ListItem> listItems){
        if(mListAdapter != null && listItems != null){
            mListAdapter.setDataList(listItems);
            mListAdapter.notifyDataSetChanged();
        }
    }
}
