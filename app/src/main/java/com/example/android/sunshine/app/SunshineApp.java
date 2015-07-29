package com.example.android.sunshine.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by michalstawarz on 29/07/15.
 */
public class SunshineApp extends Application {
    private static SunshineApp sInstance;

    public static Context getAppContext() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

}
