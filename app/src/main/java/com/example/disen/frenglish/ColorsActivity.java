package com.example.disen.frenglish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<TheWords> listOfColors = new ArrayList<TheWords>();
        listOfColors.add(new TheWords("Red","Rouge",R.drawable.color_red));
        listOfColors.add(new TheWords("Black","Noir",R.drawable.color_black));
        listOfColors.add(new TheWords("White","Blanc",R.drawable.color_white));
        listOfColors.add(new TheWords("Yellow","Jaune",R.drawable.color_dusty_yellow));
        listOfColors.add(new TheWords("Green","Vert",R.drawable.color_green));
        listOfColors.add(new TheWords("Brown","Marron",R.drawable.color_brown));
        listOfColors.add(new TheWords("Gray","Gris",R.drawable.color_gray));

        CustomAdapter words = new CustomAdapter(this, listOfColors);
        ListView listView = (ListView)findViewById(R.id.activity_colors);
        listView.setAdapter(words);
    }
}
