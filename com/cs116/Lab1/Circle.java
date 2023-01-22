package com.cs116.Lab1;

public class Circle {
    private double radius;
    private final double PI = Math.PI;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return PI * Math.pow(radius, 2);
    }

    public double circumference() {
        return 2 * PI * radius;
    }

    public double diameter() {
        return 2 * radius;
    }

    public String toString() {
        return "Circle with radius " + radius + ", diameter " + diameter() + ", circumference " + circumference() + ", and area " + area();
    }

    public boolean equalsTo(Circle o) {
        if(!(o instanceof Circle)) {
            return false;
        } else {
            if(Math.abs(radius - o.radius) < 0.0001) {
                return true;
            } else {
                return false;
            }
        }
    }

    public int compareTo(Circle o) {
        if(radius > o.radius)
            return 1;
        else if(Math.abs(radius - o.radius) < 0.0001)
            return 0;
        else
            return -1;
    }
}