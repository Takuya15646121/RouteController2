package com.example.user.routecontroller.route;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.user.routecontroller.StationSQLiteOpenHelper;

/**
 * Created by CARROT on 2016/10/11.
 */
public class RouteExtractorImpl implements RouteExtractor{

    private SQLiteDatabase database;

    public RouteExtractorImpl(Context context){
        this.database = StationSQLiteOpenHelper.getHelperObject(context).getReadableDatabase();

    }


    @Override
    public Station[] calcUsingRoute(String start, String end) {
        return new Station[0];
    }
}
