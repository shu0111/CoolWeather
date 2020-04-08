package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;
/*
"now": {
        "cloud": "91",
        "cond_code": "101",
        "cond_txt": "多云",
        "fl": "8",
        "hum": "22",
        "pcpn": "0.0",
        "pres": "1014",
        "tmp": "12",
        "vis": "21",
        "wind_deg": "234",
        "wind_dir": "西南风",
        "wind_sc": "3",
        "wind_spd": "16",
        "cond": {
            "code": "101",
            "txt": "多云"
        }
}
*/
public class Now {
    @SerializedName("tmp")
    public String temperature;  // 当前温度
    @SerializedName("cond")
    public More more;   // 更多信息
    public class More{
        @SerializedName("txt")
        public String info; // 天气信息
    }
}
