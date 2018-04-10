package com.example.housing.model;

import android.util.Log;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by rohitramaswamy on 19/04/17.
 */

@IgnoreExtraProperties
public class Members
{
	String name;
	String flat_no;
	String intercom_no;

	// required public default constructor
	Members() {}

	public Members(String name, String flat_no, String intercom_no)
	{
		this.name = name;
		this.flat_no = flat_no;
		this.intercom_no = intercom_no;
	}

	public String getIntercom_no()
	{
		Log.v("hello", intercom_no);
		return intercom_no;
	}

	public void setIntercom_no(String intercom_no)
	{
		this.intercom_no = intercom_no;
	}

	public String getFlat_no()
	{
		return flat_no;
	}

	public void setFlat_no(String flat_no)
	{
		this.flat_no = flat_no;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
