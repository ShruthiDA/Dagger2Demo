package com.learn.dagger2demo;

import android.util.Log;
import javax.inject.Inject;

public class Lannisters implements House{

    @Inject
    Lannisters(){
    }

    @Override
    public void prepare() {
        Log.i(getClass().getName() ," Lannisters preparing for war");
    }

    @Override
    public void report() {
        Log.i(getClass().getName() ," Lannisters reporting for war");
    }
}
