package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jingj on 2017/9/21.
 */

public class Forecast {

    public String data;
    @SerializedName("cond")
    public moreInfo moreInfo;
    @SerializedName("tmp")
    public Temperature tempeature;

    public class moreInfo {
        @SerializedName("txt_d")
        public String info;
    }
    public class Temperature {
        public int max;
        public int min;
    }
}
