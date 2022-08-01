package com.softserve.edu.hw3;

/*Homework 4 (from 28.07.2022)
1) Написати клас Pair, який містить два поля типу int. Додати до класу конструктор, який проініціалізує ці поля.
   Додати ло класу метод print(), який надрукує на екран обидва поля.
   Додати ло класу метод swap(), який поміняє місцями вмістиме цих полів.
   В класі App написати метод main, в якому створити об'єкт типу Pair (передати на конструкторі якісь значення).
   Викликати методи print(); swap(); та знову print();
   Для коду використати пакет com.softserve.edu.hw3
   Запушати код на github у свою вітку.
*/


public class Pair {
     private int a;
     private int b;

    public Pair() {
        a = 0;
        b = 0;}

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void swap(){
        int tmp = a;
        a = b;
        b = tmp;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}






