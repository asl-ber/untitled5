package com.company;

abstract public class birds extends Animals{

    private String color;
    private String flying;


    public birds(boolean alive, String color, String flying) {
        super(alive);
        this.color = color;
        this.flying = flying;
    }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String getFlying() { return flying; }

    public void setFlying(String flying) { this.flying = flying; }

}