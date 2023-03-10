package com.example.traveldocumentary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.traveldocumentary.SQLiteDatabaseFiles.DatabaseHelper;
import com.example.traveldocumentary.SQLiteDatabaseFiles.DestinationContracts;

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

        displayDatabaseInfo();
    }
    private void displayDatabaseInfo() {
        // To access our database, we instantiate our subclass of SQLiteOpenHelper
        // and pass the context, which is the current activity.
        DatabaseHelper mDbHelper = new DatabaseHelper(this);

        // Create and/or open a database to read from it
        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        // Perform this raw SQL query "SELECT * FROM pets"
        // to get a Cursor that contains all rows from the pets table.
        Cursor cursor = db.rawQuery("SELECT * FROM " + DestinationContracts.DesinationEntry.TABLE_NAME, null);
        try {
            // Display the number of rows in the Cursor (which reflects the number of rows in the
            // pets table in the database).
            TextView displayView = (TextView) findViewById(R.id.recommended_view);
            displayView.setText("Number of rows in Destination database table: " + cursor.getCount());
        } finally {
            // Always close the cursor when you're done reading from it. This releases all its
            // resources and makes it invalid.
            cursor.close();
        }
    }

}