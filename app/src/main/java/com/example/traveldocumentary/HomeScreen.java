package com.example.traveldocumentary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        String[] tabs = {"Upcoming Travel ","Past Travels"," Recommended Travels "};



    }
}