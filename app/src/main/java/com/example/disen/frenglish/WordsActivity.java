package com.example.disen.frenglish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WordsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
        ArrayList<TheWords> listOfWords = new ArrayList<TheWords>();
        listOfWords.add(new TheWords("A car","Une voiture",0));
        listOfWords.add(new TheWords("A truck","Un camion",0));
        listOfWords.add(new TheWords("A house","Une maison",0));
        listOfWords.add(new TheWords("A room","Une chambre",0));
        listOfWords.add(new TheWords("Forks","Des fourchettes",0));
        listOfWords.add(new TheWords("Spoons","Des cuilleres",0));
        listOfWords.add(new TheWords("A school","Une ecole",0));
        listOfWords.add(new TheWords("A family","Une famille",0));
        listOfWords.add(new TheWords("A fan","Un ventilateur",0));
        listOfWords.add(new TheWords("A table","Une table",0));

        CustomAdapter words = new CustomAdapter(this, listOfWords);
        ListView listView = (ListView)findViewById(R.id.activity_words);
        listView.setAdapter(words);
    }
}
