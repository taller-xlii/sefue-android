package com.banana.sefue.models;

import com.google.android.gms.maps.model.LatLng;
import com.google.gson.Gson;

import java.util.Date;

/**
 * Created by EDC on 03/08/14.
 */
public class event {

    public String toJson() {
        return new Gson().toJson(this);
    }

    public static event fromJson(String json) {
        return new Gson().fromJson(json, event.class);
    }

    public Long getTweetId() {
        return tweetId;
    }

    public void setTweetId(Long tweetId) {
        this.tweetId = tweetId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LatLng getLocation() {
        return location;
    }

    public void setLocation(LatLng location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    private Long tweetId;
    private Long userId;
    private LatLng location;
    private Date date;
    private Boolean status;



}
