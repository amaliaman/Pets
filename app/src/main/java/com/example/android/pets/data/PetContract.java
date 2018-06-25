package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {
    // empty constructor to prevent instantiation
    private PetContract() {
    }

    public static abstract class PetEntry implements BaseColumns {
        public static final String TABLE_NAME = "pets";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        /**
         * Possible values for gender
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

        /**
         * SQL statements
         */
        private static final String TEXT_TYPE = " TEXT";
        static final String INTEGER_TYPE = " INTEGER";
        private static final String NOT_NULL = " NOT NULL";
        private static final String COMMA_SEP = ", ";
        static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + INTEGER_TYPE + " PRIMARY KEY AUTOINCREMENT" + COMMA_SEP +
                        COLUMN_PET_NAME + TEXT_TYPE + NOT_NULL + COMMA_SEP +
                        COLUMN_PET_BREED + TEXT_TYPE + COMMA_SEP +
                        COLUMN_PET_GENDER + INTEGER_TYPE + NOT_NULL + COMMA_SEP +
                        COLUMN_PET_WEIGHT + INTEGER_TYPE + NOT_NULL + " DEFAULT 0" +
                        ")";

        private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + TABLE_NAME;
    }
}
