package com.cs116.Lab8;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        color = "BLACK";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        setColor(color);
        setFilled(filled);
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Color: " + color + "\tFilled: " + filled;
    }
}
