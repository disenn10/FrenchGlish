package com.example.disen.frenglish;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by disen on 6/6/2017.
 */

public class CustomAdapter extends ArrayAdapter {
    public CustomAdapter(Context context, ArrayList<TheWords> resource) {
        super(context,0, resource);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View  listView= convertView;
        if(listView == null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }
        TheWords current = (TheWords) getItem(position);

        TextView defaultWord = (TextView)listView.findViewById(R.id.default_name);
        TextView translation = (TextView)listView.findViewById(R.id.french_translation);
        ImageView imageView = (ImageView)listView.findViewById(R.id.image);
        defaultWord.setText(current.getWOrd());
        translation.setText(current.getFrenchTranslation());
        imageView.setImageResource(current.getImage());


        return listView;
    }
}
