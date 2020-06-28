package com.zhangweather.android.db;

import org.litepal.crud.DataSupport;

public class City<string> extends DataSupport {
    private int id;//字段
    private string cityName;//市名
    private  int cityCode;//市代号
    private int provinceId;//当前市所属省的id

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public string getCityName() {
        return cityName;
    }
    public void setCityName(string cityName) {
        this.cityName = cityName;
    }
    public int getCityCode() {
        return cityCode;
    }
    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
    public int getProvinceId() {
        return provinceId;
    }
    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

}
