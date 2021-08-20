package com.ranzan.getlistofalbums2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataViewHolder> {
    private ArrayList<ResponseModel> dataList;

    public DataAdapter(ArrayList<ResponseModel> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        ResponseModel data = dataList.get(position);
        holder.setData(data);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
