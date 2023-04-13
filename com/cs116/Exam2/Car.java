package com.cs116.Exam2;

public class Car extends Vehicle {
    private int numDoors;
    private int numSeats;

    public Car(int numDoors, int numSeats, String make, String model) {
        super(make, model);
        setDoors(numDoors);
        setSeats(numSeats);
    }

    private void setDoors(int numDoors) {
        if(numDoors > 0) 
            this.numDoors = numDoors;
    }

    private void setSeats(int numSeats) {
        if(numSeats > 0) {
            this.numSeats = numSeats;
        }
    }
    
    public int getDoors() {
        return numDoors;
    }

    public int getSeats() {
        return numSeats;
    }

    @Override
    public String drive() {
        return super.drive() + " with " + numSeats + " seats and " + numDoors + " doors";
    }

    public String toString() {
        return "Number of doors: " + numDoors + "\tNumber of Seats: " + numSeats;
    }
}
