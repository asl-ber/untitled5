package com.company;

abstract public class amphibia extends Animals {

    private String habitat;
    private String tail;
    private String crawls;


    public amphibia(boolean alive, String habitat, String tail, String crawls) {
        super(alive);
        this.habitat = habitat;
        this.tail = tail;
        this.crawls = crawls;
    }

    public String getHabitat() { return habitat; }

    public void setHabitat(String habitat) { this.habitat = habitat; }

    public String getTail() { return tail; }

    public void setTail(String tail) { this.tail = tail; }

    public String getCrawls() { return crawls; }

    public void setCrawls(String crawls) { this.crawls = crawls; }

}
