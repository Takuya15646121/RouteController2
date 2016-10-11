package com.example.user.routecontroller.route;

/**
 * Created by user on 2016/10/11.
 */
public class Station {
    private final String name;
    private final int stationId;
    private final int railId;
    private final double latitude;
    private final double longitude;

    public Station(String name,int stationId,int railId,double latitude,double longitude){
        this.name = name;
        this.stationId = stationId;
        this.railId = railId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName(){
        return this.name;
    }

    public int getStationId(){
        return  this.stationId;
    }

    public int getRailId(){
        return this.railId;
    }

    public double getLatitude(){
        return this.latitude;
    }

    public double getLongitude(){
        return this.longitude;
    }
}

