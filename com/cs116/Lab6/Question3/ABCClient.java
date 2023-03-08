package com.cs116.Lab6.Question3;

public class ABCClient {
  
    public static void main(String[] args) {
        B b1 = new B();

        B b2 = new B();
        b2.foo1();

        B b3 = new B();
        int n = b3.foo2();

        B b4 = new B();
        System.out.println(b4.foo3());

        C c1 = new C();

        C c2 = new C();
        c2.foo1();
    }
}
