package com.softserve.edu.hw5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = get3Numbers();
        Collections.sort(numbers);
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public static List<Integer> get3Numbers() {
        final List<Integer> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (numbers.size() <= 2) {
                if (scanner.hasNextInt()) {
                    numbers.add(scanner.nextInt());
                    continue;
                }
                System.out.println("Int required");
                scanner.next();
            }
        }
        return numbers;
    }
}
