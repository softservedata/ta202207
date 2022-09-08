package com.softserve.edu.hw10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppHw10 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 3, 2, 2, 1, 1);
        //delete duplicates in lists
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        System.out.println("List 1 without duplicates = " + set1);
        System.out.println("List 2 without duplicates = " + set2);

        //compare elements
        System.out.println("equal numbers are = " + set1.equals(set2));
    }
}