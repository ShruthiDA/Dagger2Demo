package com.learn.dagger2demo;

import dagger.Component;

@Component
public interface BattleComponent {

    War getWar();
    Starks getStarks();
    Lannisters getLannisters();

}
