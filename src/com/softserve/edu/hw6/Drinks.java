package com.softserve.edu.hw6;

public enum Drinks {
    WATER("Water"),
    COFFEE("Coffee"),
    WINE("Wine");
    private String description;

    public String getDescription() {
        return description;
    }

    private Drinks(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}

