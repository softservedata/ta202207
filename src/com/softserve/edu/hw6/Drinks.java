package com.softserve.edu.hw6;

public enum Drinks {
    WATER("Water"),
    COFFEE("Coffee"),
    WINE("Wine");

    private final String description;

    Drinks(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Drinks: " + description;
    }
}
