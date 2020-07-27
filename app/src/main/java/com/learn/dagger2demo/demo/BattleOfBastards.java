package com.learn.dagger2demo.demo;



public class BattleOfBastards {

    public static void main(String[] args){

        Soldier soldiers = new Soldier();
        Cash cash = new Cash();

       // BattleComponent battleComponent = DaggerBattleComponent.create();

        BattleComponent component = DaggerBattleComponent
                .builder().bravosModule(new BravosModule(cash, soldiers)).build();

        War war = component.getWar();
        war.prepareWar();
        war.reportWar();

        Starks starks = component.getStarks();
        Lannisters lannisters = component.getLannisters();

        component.getCash();
        component.getSoldiers();


    }
}
