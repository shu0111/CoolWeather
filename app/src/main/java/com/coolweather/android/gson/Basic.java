package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/*
"basic": {
            "cid": "CN101210101",
            "location": "杭州",
            "parent_city": "杭州",
            "admin_area": "浙江",
            "cnty": "中国",
            "lat": "39.90498734",
            "lon": "116.4052887",
            "tz": "+8.00",
            "city": "杭州",
            "id": "CN101210101",
            "update": {
                "loc": "2020-03-09 17:32",
                "utc": "2020-03-09 09:32"
            }
}
*/
public class Basic {
    @SerializedName("city")
    public String cityName;     // 城市名
    @SerializedName("id")
    public String weatherId;    // 天气编号
    public Update update;   // 更新状态类
    public class Update{
        @SerializedName("loc")
        public String updateTime;   // 更新时间
    }
}
