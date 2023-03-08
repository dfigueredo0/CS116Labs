package com.cs116.Lab6.Vehicles;

public class Bicycle extends Vehicle {
    private int myGearCount;

    public Bicycle() {
        myGearCount = 1;
    }

    public Bicycle (int gearCount) {
        setGearCount (gearCount);
    }

    public int getGearCount() {
        return myGearCount;
    }

    public void setGearCount(int gearCount) {
        myGearCount = gearCount;
    }
}
