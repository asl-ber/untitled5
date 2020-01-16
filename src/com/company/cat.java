package com.company;

public class cat extends mammals{

    private String color;
    private String Wild;
    private String coloreye;


    public cat(boolean alive, String legs, String habitat, String color, String wild, String coloreye) {
        super(alive, legs, habitat);
        this.color = color;
        Wild = wild;
        this.coloreye = coloreye;
    }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String getWild() { return Wild; }

    public void setWild(String wild) { Wild = wild; }

    public String getColoreye() { return coloreye; }

    public void setColoreye(String coloreye) { this.coloreye = coloreye; }



    public String color(){
        return "black";
    }

    public String coloreye(){
        return "brown";
    }

    @Override
    public String shout(){
        return "meow";
    }

}
