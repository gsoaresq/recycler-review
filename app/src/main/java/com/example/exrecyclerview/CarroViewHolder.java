package com.example.exrecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarroViewHolder extends RecyclerView.ViewHolder {

    private TextView tv_modelo;

    public CarroViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_modelo = itemView.findViewById(R.id.tv_modelo);
    }
}
