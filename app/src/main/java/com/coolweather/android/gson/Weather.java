package com.coolweather.android.gson;

import java.util.List;

/**
 * Created by Administrator on 2017-3-21.
 */

public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SuppressWarnings("daily_forecast")
    public List<Forecast> forecastList;
}
