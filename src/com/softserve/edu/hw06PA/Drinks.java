package com.softserve.edu.hw06PA;

public enum Drinks {
    WATER ("Water"), COFFEE ("Coffee"), WINE ("Wine");

    private String Description;

    private Drinks(String description) {
        this.Description = description;
    }

    public String getDescription() {
        return Description;
    }

    @Override
    public String toString() {
        return "" + Description;
    }
    }

