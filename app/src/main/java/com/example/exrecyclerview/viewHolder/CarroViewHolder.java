package com.example.exrecyclerview.viewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exrecyclerview.R;
import com.example.exrecyclerview.model.Carro;

public class CarroViewHolder extends RecyclerView.ViewHolder {

    private TextView tv_modelo;

    public CarroViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_modelo = itemView.findViewById(R.id.tv_modelo);
    }

    public void bindData(Carro carro) {
        tv_modelo.setText(carro.getModelo());
    }
}
