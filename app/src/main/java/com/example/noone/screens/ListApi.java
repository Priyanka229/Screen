package com.example.noone.screens;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ListApi {
    @GET("v2/5aa7963f2f00004c188ea5fa")
    Call<ListData> getList();
}
