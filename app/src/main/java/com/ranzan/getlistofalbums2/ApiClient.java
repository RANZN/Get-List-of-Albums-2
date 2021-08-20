package com.ranzan.getlistofalbums2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiClient {
    @GET("albums")
    Call<List<ResponseModel>> getPost();
}
