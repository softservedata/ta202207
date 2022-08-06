package com.softserve.edu.hw6;

import java.util.EnumSet;

public class HW6 {
    public static void main(String[] args) {
        for (Drinks drinks : EnumSet.allOf(Drinks.class)) {
            System.out.println(drinks);
        }
    }
}
