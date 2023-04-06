package com.cs116.Testers;

import com.cs116.Lab9.ResizeableCircle;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizeableCircle c = new ResizeableCircle(5.0);
        
        System.out.printf("Area: %.3f\n",c.getArea());
        System.out.printf("Perimeter: %.3f\n", c.getPerimeter());

        System.out.print("Increasing Radius by 50%.");
        System.out.println(" New Radius is " + c.resize(50));
        System.out.printf("Area: %.3f\n",c.getArea());
        System.out.printf("Perimeter: %.3f\n", c.getPerimeter());
    }
}
