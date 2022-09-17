package com.example.lesson_31;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {
private TextView tv_animal;


    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_animal = itemView.findViewById(R.id.tv_kgs);
    }

    public void bind(String name_animal){
        tv_animal.setText(name_animal);
    }
}
