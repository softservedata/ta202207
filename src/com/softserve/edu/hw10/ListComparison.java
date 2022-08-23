package com.softserve.edu.hw10;

import java.util.ArrayList;

public class ListComparison {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(5);
        list2.add(5);
        list2.add(7);

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list2.get(j))) {
                    System.out.println("Element " + i +
                            " of the first list equals to the element " + j + " of the second list.");
                } else {
                    System.out.println("Element " + i +
                            " of the first list equals to the element " + j + " of the second list.");
                }
            }
        }
    }
}
