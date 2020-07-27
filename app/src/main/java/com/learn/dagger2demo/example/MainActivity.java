package com.learn.dagger2demo.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.learn.dagger2demo.R;
import com.learn.dagger2demo.example.component.DaggerMainActivityComponent;
import com.learn.dagger2demo.example.component.MainActivityComponent;
import com.learn.dagger2demo.example.component.RandomUserComponent;
import com.learn.dagger2demo.example.module.ContextModule;
import com.learn.dagger2demo.example.module.MainActivityModule;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    RandomUsersApi randomUsersApi;
    Picasso picasso;
    RandomUserAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* RandomUserComponent daggerRandomUserComponent = DaggerRandomUserComponent.builder()
                .contextModule(new ContextModule(this))
                .build();
        picasso = daggerRandomUserComponent.getPicasso();
        randomUsersApi = daggerRandomUserComponent.getRandomUserService();
        // populateUsers();
        */

        MainActivityComponent mainActivityComponent = DaggerMainActivityComponent.builder()
                .mainActivityModule(new MainActivityModule(this))
                .randomUserComponent(RandomUserApplication.get(this).getRandomUserApplicationComponent())
                .build();
        randomUsersApi = mainActivityComponent.getRandomUserService();
        mAdapter = mainActivityComponent.getRandomUserAdapter();

    }
}