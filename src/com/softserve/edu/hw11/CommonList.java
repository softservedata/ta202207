package com.softserve.edu.hw11;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CommonList {
    public static void main(String[] args) {
        int minVal = 0;
        int maxVal = 100;
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randInt = ThreadLocalRandom.current().nextInt(minVal, maxVal);
            list1.add(randInt);
        }

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randInt = ThreadLocalRandom.current().nextInt(minVal, maxVal);
            list2.add(randInt);
        }

        List<Integer> list3 = new ArrayList<>(list2);
        list3.retainAll(list1);

        System.out.println("list1 - " + list1);
        System.out.println("list2 - " + list2);
        System.out.println("common list3 -" + list3);
    }
}
