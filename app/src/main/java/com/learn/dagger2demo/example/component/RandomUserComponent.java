package com.learn.dagger2demo.example.component;

import com.learn.dagger2demo.example.scope.RandomUserApplicationScope;
import com.learn.dagger2demo.example.RandomUsersApi;
import com.learn.dagger2demo.example.module.PicassoModule;
import com.learn.dagger2demo.example.module.RandomUsersModule;
import com.squareup.picasso.Picasso;

import dagger.Component;

@RandomUserApplicationScope
@Component(modules = {PicassoModule.class, RandomUsersModule.class})
public interface RandomUserComponent {

   RandomUsersApi getRandomUserService();
   Picasso getPicasso();

}
