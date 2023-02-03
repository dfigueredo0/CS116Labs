package com.cs116.Lab2;

public class Scope {
    private static int one = 1; //class data
    private int two; //instance data
    public int three; //instance data
    public static final int FOUR = 4; //class data

    public Scope(int w, int x) { // w and x is local 
        one++;
        two = w;
        three = x;
    }

    public void change(int x) {
        int y = one + x; // y is local
        two = one * y;
        three = three * FOUR;
    }

    public String toString() {
        return "one = " + one + " two = " + two + " three = " + three;
    }
}