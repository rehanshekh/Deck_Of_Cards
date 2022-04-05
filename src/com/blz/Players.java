package com.blz;

public class Players {
    String name;
    String[] cards;


    public String getName() {
        return name;
    }

    public Players(String name, int noOfCards) {
        this.name = name;
        this.cards=new String[noOfCards];
    }
    }
