package com.example.disen.frenglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Colors;
    TextView Numbers;
    TextView Phrases;
    TextView FamilyMembers;
    TextView Words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Colors = (TextView)findViewById(R.id.colors);
        Numbers = (TextView)findViewById(R.id.numbers);
        Phrases = (TextView)findViewById(R.id.phrases);
        FamilyMembers = (TextView)findViewById(R.id.family);
        Words = (TextView)findViewById(R.id.words);

        Colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ColorsActivity.class);
                startActivity(intent);
            }
        });
        Numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), NumbersActivity.class);
                startActivity(intent);
            }
        });
        Phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), PhrasesActivity.class);
                startActivity(intent);
            }
        });
        Words.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), WordsActivity.class);
                startActivity(intent);
            }
        });
        FamilyMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), FamilyMembersActivity.class);
                startActivity(intent);
            }
        });
    }
}
