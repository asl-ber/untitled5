package com.company;

import com.company.CanShout;

abstract public class mammals extends Animals implements CanShout {

    private String legs;
    private String habitat;


    public mammals(boolean alive, String legs, String habitat) {
        super(alive);
        this.legs = legs;
        this.habitat = habitat;
    }

    public String getLegs() { return legs; }

    public void setLegs(String legs) { this.legs = legs; }

    public String getHabitat() { return habitat; }

    public void setHabitat(String habitat) { this.habitat = habitat; }

}
