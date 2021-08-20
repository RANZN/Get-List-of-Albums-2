package com.ranzan.getlistofalbums2;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Network {
    private static String BASE_URL = "https://jsonplaceholder.typicode.com/";

    public static Retrofit getRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient.Builder().build())
                .build();
        return retrofit;
    }
}
