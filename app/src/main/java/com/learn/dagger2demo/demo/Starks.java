package com.learn.dagger2demo.demo;

import android.util.Log;

import javax.inject.Inject;

public class Starks implements House {

    @Inject
    Starks(){
    }

    @Override
    public void prepare() {
        Log.i(getClass().getName() ," Starks preparing for war");
    }

    @Override
    public void report() {
        Log.i(getClass().getName() ," Starks reporting for war");
    }
}
