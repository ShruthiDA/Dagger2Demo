package com.learn.dagger2demo.example.component;

import com.learn.dagger2demo.example.module.MainActivityModule;
import com.learn.dagger2demo.example.RandomUserAdapter;
import com.learn.dagger2demo.example.RandomUsersApi;
import com.learn.dagger2demo.example.scope.MainActivityScope;

import dagger.Component;

@Component(modules = MainActivityModule.class, dependencies = RandomUserComponent.class)
@MainActivityScope
public interface MainActivityComponent {

    RandomUserAdapter getRandomUserAdapter();

    RandomUsersApi getRandomUserService();
}
