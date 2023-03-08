package com.cs116.Lab6.Circles;

public class Cylinder extends Circle{
    private double length;

    public Cylinder(double radius, double length) {
        super(radius);
        setLength(length);
    }

    public void setLength(double length) {
        if(length > 0)
            this.length = length;
    }
    
    public double getVolume() {
        return (Math.PI * Math.pow(getRadius(), 2) * length);
    }

    public double getArea() {
        return ((2 * Math.PI * getRadius() * length) + (2 * Math.PI * Math.pow(getRadius(), 2)));
    }
}
