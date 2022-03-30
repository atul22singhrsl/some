package com.rajasoftwarelabs.activitybasics;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Initialize your application level dependencies or SDKs here

        Log.d("MyApplication", "onCreate called");
    }
}
