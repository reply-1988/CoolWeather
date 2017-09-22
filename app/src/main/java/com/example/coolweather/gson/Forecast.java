package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jingj on 2017/9/21.
 */

public class Forecast {

    public String date;
    @SerializedName("cond")
    public moreInfo moreInfo;
    @SerializedName("tmp")
    public Temperature temperature;

    public class moreInfo {
        @SerializedName("txt_d")
        public String info;
    }
    public class Temperature {
        public String max;
        public String min;
    }
}
