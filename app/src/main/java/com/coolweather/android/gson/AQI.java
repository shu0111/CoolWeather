package com.coolweather.android.gson;
/*
"aqi": {
        "city": {
            "aqi": "59",
            "pm25": "31",
            "qlty": "良"
        }
}
*/
public class AQI {
    public AQICity city;    // 城市
    public class AQICity{
        public String aqi;  // 空气质量指数
        public String pm25; // pm2.5浓度
    }
}
