package com.learn.dagger2demo.demo;

import javax.inject.Inject;

public class War {

    private Starks starks;
    private Lannisters lannisters;

    //Bad practice, War cant be tested independent of Stark & Lannister class
    /**
     public War(){
     starks = new Starks();
     lannisters = new Lannisters();
     starks.prepare();
     starks.report();
     lannisters.prepare();
     lannisters.report();
     }
      */

    //GOOD PRACTISE, Getting the dependencies passed to constructor
    @Inject
    public War(Starks starks , Lannisters lannisters){
        this.starks = starks;
        this.lannisters = lannisters;
    }

    public void prepareWar(){
        starks.prepare();
        lannisters.report();
    }
    public void reportWar(){
        starks.report();
        lannisters.report();
    }
}
