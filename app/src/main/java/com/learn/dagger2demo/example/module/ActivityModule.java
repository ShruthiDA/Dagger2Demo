package com.learn.dagger2demo.example.module;

import android.app.Activity;
import android.content.Context;

import com.learn.dagger2demo.example.scope.RandomUserApplicationScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private final Context context;

    ActivityModule(Activity context){
        this.context = context;
    }

    @Named("activity_context")
    @RandomUserApplicationScope
    @Provides
    public Context context(){ return context; }
}
