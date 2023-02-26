package com.example.traveldocumentary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        String[] tabs = {" Upcoming Travel "," Past Travels"," Recommended Travels "};
        LinearLayout rootview = (LinearLayout) findViewById(R.id.rootview);

//        for(int i =0;i<tabs.length;i++){
//            TextView word = new TextView(this);
//            word.setText(tabs[i]);
//            word.setPadding(40,40,40,40);
//            word.setTextSize(20);
//            rootview.addView(word);
//        }

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tabs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


    }
}