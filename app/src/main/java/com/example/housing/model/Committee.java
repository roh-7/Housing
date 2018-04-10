package com.example.housing.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by rohitramaswamy on 19/04/17.
 */

@IgnoreExtraProperties
public class Committee
{
	String name;
	String position;
	String flat_no;

	// required public default constructor
	public Committee() {}

	public Committee(String name, String position, String flat_no)
	{
		this.name = name;
		this.position = position;
		this.flat_no = flat_no;
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

	public String getPosition()
	{
		return position;
	}

	public void setPosition(String position)
	{
		this.position = position;
	}
}