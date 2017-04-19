package com.example.housing.utils;

/**
 * Created by rohitramaswamy on 19/04/17.
 */

public class Intercom
{
    String name;
    String intercom_no;

    // required public default constructor
    public Intercom(){}

    public Intercom(String name, String intercom_no)
    {
        this.name = name;
        this.intercom_no = intercom_no;
    }

    public String getName() {
        return this.name;
    }

    public String getIntercom_no() {
        return this.intercom_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIntercom_no(String intercom_no) {
        this.intercom_no = intercom_no;
    }
}
