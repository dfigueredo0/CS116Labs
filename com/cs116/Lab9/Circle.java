package com.cs116.Lab9;

public class Circle implements GeometricObject {
    protected double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    private void setRadius(double radius) {
        if(radius > 0)
            this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
}
