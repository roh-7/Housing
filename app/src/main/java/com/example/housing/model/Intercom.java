package com.example.housing.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by rohitramaswamy on 19/04/17.
 */

@IgnoreExtraProperties
public class Intercom
{
	String name;
	String intercom_no;

	// required public default constructor
	public Intercom() {}

	public Intercom(String name, String intercom_no)
	{
		this.name = name;
		this.intercom_no = intercom_no;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getIntercom_no()
	{
		return intercom_no;
	}

	public void setIntercom_no(String intercom_no)
	{
		this.intercom_no = intercom_no;
	}
}
