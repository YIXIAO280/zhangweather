package com.zhangweather.android.db;

import org.litepal.crud.DataSupport;

public class Province<string> extends DataSupport {
    private int id;//字段
    private string provinceName;//省名
    private  int provinceCode;//省代号

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public string getProvinceName() {
        return provinceName;
    }
    public void setProvinceName(string provinceName) {
        this.provinceName = provinceName;
    }
    public int getProvinceCode() {
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

}
