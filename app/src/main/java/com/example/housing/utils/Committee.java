package com.example.housing.utils;

/**
 * Created by rohitramaswamy on 19/04/17.
 */

public class Committee
{
    String name;
    String position;
    String flat_no;

    // required public default constructor
    public Committee(){}

    public Committee(String name, String position, String flat_no)
    {
        this.name = name;
        this.position = position;
        this.flat_no = flat_no;
    }

    public String getFlat_no() {
        return this.flat_no;
    }

    public String getName() {
        return this.name;
    }

    public String getPosition() {
        return this.position;
    }

    public void setFlat_no(String flat_no) {
        this.flat_no = flat_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

