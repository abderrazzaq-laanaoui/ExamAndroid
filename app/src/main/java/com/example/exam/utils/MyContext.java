package com.example.exam.utils;

import android.app.Application;
import android.widget.Spinner;

import com.example.exam.business.DefaultService;
import com.example.exam.business.Services;

public class MyContext extends Application {
    private Services services;

    public MyContext()
    {

    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.services=new DefaultService();
    }

    public Services getServices() {
        return services;
    }
}
