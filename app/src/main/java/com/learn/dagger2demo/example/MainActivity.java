package com.learn.dagger2demo.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.FirebaseApp;
import com.learn.dagger2demo.R;
import com.learn.dagger2demo.example.component.DaggerMainActivityComponent;
import com.learn.dagger2demo.example.component.MainActivityComponent;
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
        FirebaseApp.initializeApp(getApplicationContext());
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

        mainActivityComponent.injectMainActivity(this);

        // We can inject these
        randomUsersApi = mainActivityComponent.getRandomUserService();
        mAdapter = mainActivityComponent.getRandomUserAdapter();

    }
}