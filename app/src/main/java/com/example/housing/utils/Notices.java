package com.example.housing.utils;

/**
 * Created by rohitramaswamy on 19/04/17.
 */

public class Notices
{
    String title;
    String subtitle;

    // required public default constructor
    Notices(){}

    Notices(String title,String subtitle)
    {
        this.title = title;
        this.subtitle = subtitle;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public String getTitle() {
        return this.title;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
