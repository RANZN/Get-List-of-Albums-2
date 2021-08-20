package com.ranzan.getlistofalbums2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DataViewHolder extends RecyclerView.ViewHolder {
    private TextView userId;
    private TextView id;
    private TextView title;

    public DataViewHolder(@NonNull View itemView) {
        super(itemView);
        userId = itemView.findViewById(R.id.userId);
        id = itemView.findViewById(R.id.id);
        title = itemView.findViewById(R.id.title);
    }

    public void setData(ResponseModel data) {
        userId.setText(data.getUserId() + "");
        id.setText(data.getId() + "");
        title.setText(data.getTitle() + "");
    }
}
