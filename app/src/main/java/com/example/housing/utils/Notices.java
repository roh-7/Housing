package com.example.housing.utils;

/**
 * Created by rohitramaswamy on 19/04/17.
 */

public class Notices
{
    String title;
    String subtitle;
    String timestamp;

    // required public default constructor
    public Notices(){}

    public Notices(String title, String subtitle,String timestamp)
    {
        this.title = title;
        this.subtitle = subtitle;
        this.timestamp = timestamp;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getTitle() {
        return title;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
