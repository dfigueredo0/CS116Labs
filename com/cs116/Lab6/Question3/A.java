package com.cs116.Lab6.Question3;

public class A {
    private int number ;
    protected String name ;
    public double price ;
    
    public A() {
        System.out.println("A() called");
    }

    private void foo1() {
        System.out.println("A version of foo1() called");
    }

    protected int foo2() {
        System.out.println("A version of foo2() called");
        return number;
    }

    public String foo3() {
        System.out.println("A version of foo3() called");
        return "Hi";
    }
}
