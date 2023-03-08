package com.cs116.Lab6.Circles;

public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }

    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }
}
