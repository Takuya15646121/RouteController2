package com.example.user.routecontroller.route;

/**
 * Created by user on 2016/10/11.
 */
public interface RouteExtractor {
    public Station[] calcUsingRoute(String start,String end);
}
