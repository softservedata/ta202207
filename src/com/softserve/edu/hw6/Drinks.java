package com.softserve.edu.hw6;

public enum Drinks {

    WATER ("Cold water"),
    COFFEE ("Strong coffee"),
    WINE ("Red wine");

    private String description;

    Drinks (String description) {
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    @Override
    public String toString(){
        return this.description;
    }
};