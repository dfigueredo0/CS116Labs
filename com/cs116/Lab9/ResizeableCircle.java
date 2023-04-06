package com.cs116.Lab9;

public class ResizeableCircle extends Circle implements Resizeable {
    public ResizeableCircle(double radius) {
        super(radius);
    }

    @Override
    public double resize(int percent) {
        radius += (radius * ((double)percent/100.0));
        return radius;
    }
}
