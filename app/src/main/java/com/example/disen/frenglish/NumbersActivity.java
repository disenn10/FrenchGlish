package com.example.disen.frenglish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<TheWords> listOfNumbers = new ArrayList<TheWords>();
        listOfNumbers.add(new TheWords("One","Un",R.drawable.number_one));
        listOfNumbers.add(new TheWords("Two","Deux",R.drawable.number_two));
        listOfNumbers.add(new TheWords("Three","Trois",R.drawable.number_three));
        listOfNumbers.add(new TheWords("Four","Quatre",R.drawable.number_four));
        listOfNumbers.add(new TheWords("Five","Cinq",R.drawable.number_five));
        listOfNumbers.add(new TheWords("Six","Six",R.drawable.number_six));
        listOfNumbers.add(new TheWords("Seven","Sept",R.drawable.number_seven));
        listOfNumbers.add(new TheWords("Eight","Huit",R.drawable.number_eight));
        listOfNumbers.add(new TheWords("Nine","Neuf",R.drawable.number_nine));
        listOfNumbers.add(new TheWords("Ten","Dix",R.drawable.number_ten));

        CustomAdapter words = new CustomAdapter(this, listOfNumbers);
        ListView listView = (ListView)findViewById(R.id.activity_numbers);
        listView.setAdapter(words);

    }

}
