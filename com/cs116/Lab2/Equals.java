package com.cs116.Lab2;

public class Equals {
    public static void main(String[] args) {
        int x = 5, y = 5, z = 6;
        System.out.println("x is " + x + "\ty is " + y + "\tz is " + z);
        System.out.println("x == y is " + (x == y));
        System.out.println("x == z is " + (x == z));

        String r = new String("Help");
        String s = new String("Help");
        String t = new String("HELP");

        System.out.println("\nr is " + r + "\ts is " + s + "\tt is " + t);
        System.out.println("r == s is " + (r == s));
        System.out.println("r == t is " + (r == t));

        System.out.println("r.equals(s) is " + r.equals(s));

        System.out.println("r.equals(t) is " + r.equals(t));
        System.out.println("r.equals(t) is " + r.equalsIgnoreCase(t));
    }
}
