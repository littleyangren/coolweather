package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yr on 2018/3/15.
 */

public class County extends DataSupport {

    private int id;

    private String coutyName;

    private String weatherId;

    private int cityId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCoutyName(){
        return coutyName;
    }

    public void setCoutyName(String coutyName){
        this.coutyName = coutyName;
    }

    public String getWeatherId(){
        return weatherId;
    }

    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }

    public int getCityId(){
        return cityId;
    }

    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
