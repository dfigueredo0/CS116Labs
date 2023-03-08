package com.cs116.Testers;

import com.cs116.Lab6.Circles.Circle;
import com.cs116.Lab6.Circles.Cylinder;

public class CirclesClient {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        Cylinder cylinder = new Cylinder(5, 8);
    
        System.out.println(c.getPerimeter());
        System.out.println(c.getArea());

        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
 }
