package com.company;

import com.company.CanCrawls;

public class lizard extends amphibia implements CanCrawls {

    private String color;


    public lizard(boolean alive, String habitat, String tail, String crawls, String color) {
        super(alive, habitat, tail, crawls);
        this.color = color;
    }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }


    public String color(){
        return "green";
    }

    public String habitat(){
        return "steppe";
    }

    public String tail(){
        return "there is";
    }

    @Override
    public String crawls(){
        return "crawls";
    }
}
