package com.example.noone.screens;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ListItemClient {
    private static final String BASE_URL = "http://www.mocky.io/";
    private static Retrofit mRetrofit;

    private static Retrofit getListRetrofit() {
        if (mRetrofit == null) {
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }

        return mRetrofit;
    }
    public static ListApi getListOfItemApi() {

        Retrofit retrofit = getListRetrofit();
        ListApi listApi = retrofit.create(ListApi.class);

        return listApi;
    }

}
