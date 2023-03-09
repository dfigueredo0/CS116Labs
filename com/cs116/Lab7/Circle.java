package com.cs116.Lab7;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        super();
        setRadius(1);
    }

    public Circle(double radius) {
        super();
        setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius > 0) 
            this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double getPerimeter() {
        return (Math.PI * 2 * radius);
    }

    @Override
    public String toString() {
        return "Color: " + super.color + "\tFilled: " + super.filled + "\tRadius: " + radius + "\nArea: " + getArea() + "\tPerimeter: " + getPerimeter();
    }
    
}
