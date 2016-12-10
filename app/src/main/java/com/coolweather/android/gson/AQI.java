package com.coolweather.android.gson;

/**
 * Created by small_yong on 2016/12/9.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
