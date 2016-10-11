package com.example.user.routecontroller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by user on 2016/10/11.
 */
public class SQLiteOpenHelperImpl extends SQLiteOpenHelper{

    private static final String DB = "";
    private static final int DB_VERSION = 1;

    private static volatile SQLiteOpenHelper helper = null;

    public SQLiteOpenHelper getHelperObject(Context context){
        if(helper == null){
            SQLiteOpenHelper myHelper = new SQLiteOpenHelperImpl(context);
            helper = myHelper;
        }
        return helper;
    }


    private SQLiteOpenHelperImpl(Context context) {
        super(context,DB,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
