package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by small_yong on 2016/12/9.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("tex")
        public String info;
    }

}
