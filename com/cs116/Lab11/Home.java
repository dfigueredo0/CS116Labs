package com.cs116.Lab11;

public class Home {
    private int numRooms;
    private double squareFootage;
    private boolean hasBasement;

    public Home(int numRooms, double squareFootage, boolean hasBasement) {
        setRooms(numRooms);
        setSquareFootage(squareFootage);
        this.hasBasement = hasBasement;
    }

    private void setRooms(int numRooms) {
        if(numRooms > 0) 
            this.numRooms = numRooms;
    }

    private void setSquareFootage(double squareFootage) {
        if(squareFootage > 0) 
            this.squareFootage = squareFootage;
    }

    @Override
    public String toString() {
        return "Home with " + numRooms + " rooms, " + squareFootage + " sq ft., " + (hasBasement ? "with a basement" : "without a basement");
    }
}
