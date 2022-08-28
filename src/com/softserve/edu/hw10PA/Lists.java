package com.softserve.edu.hw10PA;

import java.util.ArrayList;
import java.util.Iterator;

public class Lists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(5);
        list1.add(7);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(3);
        list2.add(1);
        list2.add(3);
        list2.add(7);
        list2.add(7);

        int i;
        int j;

        {

                for (i = 0; i < list1.size(); i++) {
                    for (j = 0; j < list2.size(); j++) {
                        if (list1.get(i).equals(list2.get(j))) {
                            System.out.println("The element of the list1 with index " + i +
                                    " is equal to the element of the list2 with index " + j );
                        }
                    }
                }
            }
    }
}