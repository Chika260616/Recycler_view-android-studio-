package com.example.Lab08_recycler_view;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.Lab08_recycler_view.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("IT-120","Chyngyz","Ryskeldiev", R.drawable.chyngyz));
        items.add(new Item("IT-120","Eraaly","Kasymbekov", R.drawable.b));
        items.add(new Item("IT-120","Esentur","Omorov", R.drawable.esentur));
        items.add(new Item("IT-120","Azamat","Rysbekov", R.drawable.azamat));
        items.add(new Item("IT-120","Islam","Islamidinov", R.drawable.islam));
        items.add(new Item("IT-120","Aman","Openov", R.drawable.aman));
        items.add(new Item("IT-120","Ioann","Isakov", R.drawable.ioann));
        items.add(new Item("IT-120","Aidai","Idrisova", R.drawable.aidai));
        items.add(new Item("IT-120","Azat","Asanov", R.drawable.azat));
        items.add(new Item("IT-120","Asel","Anarbekov", R.drawable.asel));
        items.add(new Item("IT-120","WhatIsLove ","BabyDon'tHurtMe", R.drawable.vladislav));
        items.add(new Item("IT-120","Rysbek","Tokoev", R.drawable.rysbek));
        items.add(new Item("IT-120","Arseniy","Radchenko", R.drawable.arseniy));
        items.add(new Item("IT-120","Alexander","LObanov", R.drawable.alexander));
        items.add(new Item("IT-120","Shabdan","Tagaev", R.drawable.shabdan));
        items.add(new Item("IT-120","Janat","Janatov", R.drawable.janat));
        items.add(new Item("IT-120","Dastan","Maarazykov", R.drawable.b));
        items.add(new Item("IT-120","Asylbek","Dzheinaliev", R.drawable.b));
        items.add(new Item("IT-120","Aydaiym","Tursunaliev", R.drawable.a));
        items.add(new Item("IT-120","Alban","Albanov", R.drawable.b));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));


    }


}