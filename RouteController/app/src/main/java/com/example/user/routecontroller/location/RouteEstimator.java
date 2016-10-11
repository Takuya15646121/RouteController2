package com.example.user.routecontroller.location;

import com.example.user.routecontroller.route.Station;

/**
 * Created by user on 2016/10/11.
 */
public interface RouteEstimator {
    public Station estimateNextStation();
}
