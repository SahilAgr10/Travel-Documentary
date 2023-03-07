package com.example.traveldocumentary.SQLiteDatabaseFiles;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String LOG_TAG = DestinationContracts.class.getSimpleName();
    private static final String DATABASE_NAME = "TravelDestination.db";
    private static final int DATABASE_VERSION = 1;//If you change the database schema,
    // you must increment the database version.


    public DatabaseHelper(Context context) { //called when the database is created for the first time.
        super(context,DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        // Create a String that contains the SQL statement to create the pets table
        String SQL_CREATE_DESTINATION_TABLE = new StringBuilder().append("CREATE TABLE ")
                .append(DestinationContracts.DesinationEntry.TABLE_NAME)
                .append("(").append(DestinationContracts.DesinationEntry.ROW_ID)
                .append(" INTEGER PRIMARY KEY AUTOINCREMENT, ")
                .append(DestinationContracts.DesinationEntry.DESTINATION_NAME)
                .append("TEXT NOT NULL, ")
                .append(DestinationContracts.DesinationEntry.DESTINATION_DATE)
                .append(" TEXT NOT NULL, ")
                .append(DestinationContracts.DesinationEntry.DESTINATION_SCHEDULE)
                .append("TEXT NOT NULL DEFAULT Upcoming);").toString();
        // Execute the SQL statement
        db.execSQL(SQL_CREATE_DESTINATION_TABLE);
    }
    //This is called when the database needs to be upgraded.
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // The database is still at version 1, so there's nothing to do be done here.
    }
}
