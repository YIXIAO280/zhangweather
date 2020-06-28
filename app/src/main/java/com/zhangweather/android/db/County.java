package com.zhangweather.android.db;

import org.litepal.crud.DataSupport;

public class County<string> extends DataSupport {
    private int id;//字段
    private string countyName;//县名
    private string weatherId;//县所对应的天气id
    private int cityId;//当前县所属市的id

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public string getCountyName() {
        return countyName;
    }
    public void setCountyName(string countyName) {
        this.countyName = countyName;
    }
    public string getWeatherId() {
        return weatherId;
    }
    public void setWeatherId(string weatherId) {
        this.weatherId = weatherId;
    }
    public int getCityId() {
        return cityId;
    }
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
