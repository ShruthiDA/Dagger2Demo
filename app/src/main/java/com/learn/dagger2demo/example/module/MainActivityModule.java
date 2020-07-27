package com.learn.dagger2demo.example.module;

import com.learn.dagger2demo.example.MainActivity;
import com.learn.dagger2demo.example.RandomUserAdapter;
import com.learn.dagger2demo.example.scope.MainActivityScope;
import com.squareup.picasso.Picasso;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    private final MainActivity mainActivity;

    public MainActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    @MainActivityScope
    public RandomUserAdapter randomUserAdapter(Picasso picasso){
        return new RandomUserAdapter(mainActivity, picasso);
    }
}
