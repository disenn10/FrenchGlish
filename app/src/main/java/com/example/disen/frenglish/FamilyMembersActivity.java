package com.example.disen.frenglish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);
        ArrayList<TheWords> listOfFamilyMembers = new ArrayList<TheWords>();
        listOfFamilyMembers.add(new TheWords("Father","Pere",R.drawable.family_father));
        listOfFamilyMembers.add(new TheWords("Mother","Mere",R.drawable.family_mother));
        listOfFamilyMembers.add(new TheWords("Brother","Frere",R.drawable.family_older_brother));
        listOfFamilyMembers.add(new TheWords("Sister","Soeur",R.drawable.family_older_sister));
        listOfFamilyMembers.add(new TheWords("Son","Fils",R.drawable.family_son));
        listOfFamilyMembers.add(new TheWords("Daughter","Fille",R.drawable.family_daughter));
        listOfFamilyMembers.add(new TheWords("Grandmother","Grand-mere",R.drawable.family_grandmother));
        listOfFamilyMembers.add(new TheWords("Grandfather","Grand-pere",R.drawable.family_grandfather));

        CustomAdapter words = new CustomAdapter(this, listOfFamilyMembers);
        ListView listView = (ListView)findViewById(R.id.activity_family_members);
        listView.setAdapter(words);
    }
}
