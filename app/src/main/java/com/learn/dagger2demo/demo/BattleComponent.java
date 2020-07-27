package com.learn.dagger2demo.demo;

import dagger.Component;

@Component(modules = BravosModule.class )
public interface BattleComponent {

    War getWar();
    Starks getStarks();
    Lannisters getLannisters();
    Cash getCash();
    Soldier getSoldiers();

}
