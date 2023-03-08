package com.example.traveldocumentary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        getWindow().setStatusBarColor(ContextCompat.getColor(HomeScreen.this,R.color.creamWhiteFaint));

//        TextView textView = new TextView(this);
//        textView.setText("SAHIL");
//        textView.setTextSize(50);
//        LinearLayout view = (LinearLayout) findViewById(R.id.rootview);
//        view.addView(textView);

        ArrayList<TabsInfo> list = new ArrayList<TabsInfo>();
        list.add(new TabsInfo("Mumbai","March 2022",R.drawable.mumbai));
        list.add(new TabsInfo("Delhi","May 2022"));
        list.add(new TabsInfo("Uttarakhand","May 2022",R.drawable.screen1));
        list.add(new TabsInfo("Rajasthan","Upcoming"));
        list.add(new TabsInfo("Himachal","Upcoming",R.drawable.mumbai));
        list.add(new TabsInfo("Kasol","Upcoming"));


        TabsInfoAdapter itemsAdapter = new TabsInfoAdapter(this,list);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}