package com.example.housing;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by rohitramaswamy on 21/03/18.
 */

public class HousingApplication extends Application
{

	@Override
	public void onCreate()
	{
		super.onCreate();
		FirebaseApp.initializeApp(this);
		FirebaseDatabase.getInstance().setPersistenceEnabled(true);
	}
}
