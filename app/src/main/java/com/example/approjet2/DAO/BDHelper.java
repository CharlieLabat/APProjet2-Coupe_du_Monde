package com.example.approjet2.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BDHelper extends SQLiteOpenHelper {


    public BDHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String req1 ="CREATE TABLE pays (pays TEXT, points INTEGER, victoire INTEGER, nul INTEGER, defaite INTERGER);" ;
        String req2 ="CREATE TABLE resultat (pays1 INTEGER, scoreEq1 INTEGER, scoreEq2 INTEGER, pays2 INTEGER, dateMatch DATE);";
        sqLiteDatabase.execSQL(req1);
        sqLiteDatabase.execSQL(req2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
