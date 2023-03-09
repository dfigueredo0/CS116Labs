package com.cs116.Lab7;

public class Rectangle extends Shape {
    protected double length;
    protected double width;

    public Rectangle() {
        super();
        setLength(1);
        setWidth(1);
    }

    public Rectangle(double length, double width) {
        super();
        setLength(length);
        setWidth(width);
    }

    public Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length > 0)
            this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0)
            this.width = width;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (2 * (width + length));
    }

    @Override
    public String toString() {
        return "Color: " + super.color + "\tFilled: " + super.filled + "\tLength: " + length + "\tWidth: " + width + "\nArea: " + getArea() + "\tPerimeter: " + getPerimeter();
    }
}