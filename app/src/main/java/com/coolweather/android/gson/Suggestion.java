package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/*
"suggestion": {
            "comf": {
                "type": "comf",
                "brf": "较舒适",
                "txt": "白天会有降雨，这种天气条件下，人们会感到有些凉意，但大部分人完全可以接受。"
            },
            "sport": {
                "type": "sport",
                "brf": "较不宜",
                "txt": "有降水，且风力较强，推荐您在室内进行各种健身休闲运动；若坚持户外运动，请注意防风保暖。"
            },
            "cw": {
                "type": "cw",
                "brf": "不宜",
                "txt": "不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"
            }
}
*/
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort; // 舒适度
    @SerializedName("cw")
    public CarWash carWash; // 洗车建议
    public Sport sport; // 运动建议
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
