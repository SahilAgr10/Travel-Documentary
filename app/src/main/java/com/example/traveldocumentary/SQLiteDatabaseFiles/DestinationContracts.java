package com.example.traveldocumentary.SQLiteDatabaseFiles;

import android.provider.BaseColumns;

public class DestinationContracts {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private DestinationContracts() {}

    public static final class DesinationEntry implements BaseColumns {
        public final static String TABLE_NAME = "AddDestination"; //Name of database table for Destination storage
        public final static String ROW_ID = BaseColumns._ID;//Unique ID number for the pet (only for use in the database table).
        public final static String DESTINATION_NAME ="Bombay";
        public final static String DESTINATION_DATE = "March 2020";
        public final static String DESTINATION_SCHEDULE = "Upcoming";



    }
}
