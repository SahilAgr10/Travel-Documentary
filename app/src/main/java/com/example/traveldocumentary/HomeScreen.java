package com.example.traveldocumentary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

        ArrayList<TabsInfo> list = new ArrayList<TabsInfo>();
        list.add(new TabsInfo("Mumbai","March 2022",R.drawable.mumbai));
        list.add(new TabsInfo("Delhi","May 2022",R.drawable.uttarakhand));
        list.add(new TabsInfo("Uttarakhand","May 2022",R.drawable.mumbai));


        TabsInfoAdapter itemsAdapter = new TabsInfoAdapter(this,list);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}