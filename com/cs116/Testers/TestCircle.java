package com.cs116.Testers;

import com.cs116.Lab9.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(3.0);
        System.out.printf("%.3f\n", c.getPerimeter());
        System.out.printf("%.3f", c.getArea());
    }
}
