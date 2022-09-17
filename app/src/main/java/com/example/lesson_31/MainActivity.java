package com.example.lesson_31;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        arrayList.add("White Shark");
        arrayList.add("Gorilla");
        arrayList.add("King Kobra");
        arrayList.add("Wolf");
        arrayList.add("Crocodile");
        arrayList.add("Tiger");
        arrayList.add("Black Mamba");
        arrayList.add("Black Shark");
        arrayList.add("Anaconda");
        arrayList.add("Viper");
        arrayList.add("Lizard");
        arrayList.add("Alligator");
        arrayList.add("Sword Fish");
        arrayList.add("Chainsaw Fish");
        arrayList.add("Crab");
        arrayList.add("Cancer");
        arrayList.add("Frog");
        arrayList.add("Lion");
        arrayList.add("Mouse");
        arrayList.add("Eagle");


        AnimalAdapter animalAdapter = new AnimalAdapter(arrayList);

        recyclerView.setAdapter(animalAdapter);

    }
}