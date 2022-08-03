package com.softserve.hw5;

public class HW5Test {
    public static void main(String[] args) {
        HW5 hw = new HW5(89,96,88);

        if (hw.getA() < hw.getB() && hw.getB() < hw.getC())
            System.out.println(hw.getA() + " " + hw.getB() + " " + hw.getC());
        else if (hw.getA() < hw.getC() && hw.getC() < hw.getB())
            System.out.println(hw.getA() + " " + hw.getC() + " " + hw.getB());
        else if (hw.getB() < hw.getA() && hw.getA() < hw.getC())
            System.out.println(hw.getB() + " " + hw.getA() + " " + hw.getC());
        else if (hw.getB() < hw.getC() && hw.getC() < hw.getA())
            System.out.println(hw.getB() + " " + hw.getC() + " " + hw.getA());
        else if (hw.getC() < hw.getA() && hw.getA() < hw.getB())
            System.out.println(hw.getC() + " " + hw.getA() + " " + hw.getB());
        else if (hw.getC() < hw.getB() && hw.getB() < hw.getA())
            System.out.println(hw.getC() + " " + hw.getB() + " " + hw.getA());

    }
}
