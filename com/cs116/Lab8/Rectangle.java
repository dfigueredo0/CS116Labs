package com.cs116.Lab8;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        width = 2.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        setWidth(width);
        setLength(length);
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    protected void setWidth(double width) {
        if(width > 0)
            this.width = width;
    }

    public double getLength() {
        return length;
    }

    protected void setLength(double length) {
        if(length > 0)
            this.length = length;
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
        return super.toString() + "\nWidth: " + width + "\tLength: " + length + "\nArea: " + getArea() + "\tPerimeter: " + getPerimeter();
    }
}
