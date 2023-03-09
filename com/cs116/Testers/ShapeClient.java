package com.cs116.Testers;

import com.cs116.Lab7.*;

public class ShapeClient {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.5, "RED", false);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        Rectangle r1 = new Rectangle(1.0, 2.0, "RED", false );
        System.out.println(r1 );
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        
        Square sq1 = new Square(6.6);
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
