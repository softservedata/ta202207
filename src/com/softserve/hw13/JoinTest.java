package com.softserve.hw13;
//Homework 13 (from 01.09.2022)
//        1) Створити три потоки, кожен з яких 10 разів буде друкувати свій id.
//        Третій потік повинен запуститися після завершення роботи перших двох.
//        Для коду використати пакет com.softserve.homework13
//        Запушати код на github у свою вітку.


public class JoinTest {
    public static int sum = 0;
    public static Object monitor = new Object();


    public static void main(String[] args) throws InterruptedException{
        Runnable r1 = new Run1p();
        Thread t1 = new Thread(r1);
        Runnable r2 = new Run1m();
        Thread t2 = new Thread(r2);
        Runnable r3 = new Run1c();
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        t3.start();
        t3.join();
    }
}
