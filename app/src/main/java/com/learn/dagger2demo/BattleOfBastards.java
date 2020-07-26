package com.learn.dagger2demo;

public class BattleOfBastards {

    public static void main(String[] args){

        BattleComponent battleComponent = DaggerBattleComponent.create();
        War war = battleComponent.getWar();
        war.prepareWar();
        war.reportWar();

        Starks starks = battleComponent.getStarks();
        Lannisters lannisters = battleComponent.getLannisters();
    }
}
