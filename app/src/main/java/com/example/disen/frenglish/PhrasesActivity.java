package com.example.disen.frenglish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<TheWords> listOfPhrases = new ArrayList<TheWords>();
        listOfPhrases.add(new TheWords("Good morning","Bonjour",0));
        listOfPhrases.add(new TheWords("Hi","Salut",0));
        listOfPhrases.add(new TheWords("How are you?","Comment tu vas?",0));
        listOfPhrases.add(new TheWords("I am fine","Je vais bien",0));
        listOfPhrases.add(new TheWords("Where are you going?","Ou tu vas?",0));
        listOfPhrases.add(new TheWords("I am going to school","Je vais a l'ecole",0));
        listOfPhrases.add(new TheWords("What is your name?","Comment tu t'appeles?",0));
        listOfPhrases.add(new TheWords("My name is...","Je m'appeles...",0));
        listOfPhrases.add(new TheWords("Goodbye","Aurevoir",0));
        listOfPhrases.add(new TheWords("Good night","Bonne nuit",0));

        CustomAdapter words = new CustomAdapter(this, listOfPhrases);
        ListView listView = (ListView)findViewById(R.id.activity_phrases);
        listView.setAdapter(words);
    }
}
