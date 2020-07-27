package com.learn.dagger2demo.demo;

import dagger.Module;
import dagger.Provides;

@Module
public class BravosModule {

    private Cash cash;
    private Soldier soldier;

    public BravosModule(Cash cash, Soldier soldier) {
        this.cash = cash;
        this.soldier = soldier;
    }

    @Provides
    public Cash getCash() {
        return cash;
    }

    @Provides
    public Soldier getSoldier() {
        return soldier;
    }
}
