package com.example.housing.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by rohitramaswamy on 21/03/18.
 */

public class SessionManager
{

	public static final String PREF_NAME = "housing_prefs";
	public static final int PRIVATE_MODE = 0;
	Context context;
	SharedPreferences preferences;
	SharedPreferences.Editor editor;

	public SessionManager(Context context)
	{
		this.context = context;
		preferences = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
		editor = preferences.edit();
	}

}
