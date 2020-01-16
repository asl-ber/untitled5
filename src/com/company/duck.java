package com.company;

import com.company.CanFlying;
import com.company.CanShout;
import com.company.CanSwim;

public class duck extends birds implements CanShout, CanFlying, CanSwim {

    private String home;


    public duck(boolean alive, String color, String flying, String home) {
        super(alive, color, flying);
        this.home = home;
    }

    public String getHome() { return home; }

    public void setHome(String home) { this.home = home; }


    public String color(){
        return "white";
    }

    @Override
    public String shout(){
        return "Krea";
    }

    @Override
    public String flying(){
        return "flies";
    }

    @Override
    public String swim(){
        return "swims";
    }

}