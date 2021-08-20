package com.ranzan.getlistofalbums2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<ResponseModel> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        buildData();
    }

    private void buildData() {
        ApiClient apiClient = Network.getRetrofit().create(ApiClient.class);
        apiClient.getPost().enqueue(new Callback<List<ResponseModel>>() {
            @Override
            public void onResponse(Call<List<ResponseModel>> call, Response<List<ResponseModel>> response) {
                dataList = response.body();
                setRecyclerView();
            }

            @Override
            public void onFailure(Call<List<ResponseModel>> call, Throwable t) {

            }
        });

    }

    private void setRecyclerView() {
        DataAdapter dataAdapter = new DataAdapter((ArrayList<ResponseModel>) dataList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(dataAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}