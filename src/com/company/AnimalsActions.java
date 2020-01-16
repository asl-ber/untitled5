package com.company;

import com.company.CanCrawls;
import com.company.CanFlying;
import com.company.CanShout;
import com.company.CanSwim;

final public class AnimalsActions {

    private AnimalsActions(){
    }

    public static void makeThemShout (CanShout[] canShouts){

        for (CanShout CanShout : canShouts) {
            System.out.println(CanShout.shout());
        }
    }

    public static void makeThemFlying (CanFlying[] canFlyings){

        for (CanFlying CanFlying : canFlyings) {
            System.out.println(CanFlying.flying());
        }
    }

    public static void makeThemCrawls (CanCrawls[] canCrawls){

        for (CanCrawls CanCrawls : canCrawls) {
            System.out.println(CanCrawls.crawls());
        }
    }

    public static void makeThemSwim(CanSwim[] canSwims){

        for (CanSwim CanSwim : canSwims) {
            System.out.println(CanSwim.swim());
        }
    }

}