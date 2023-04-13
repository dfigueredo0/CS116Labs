package com.cs116.Exam2;

public class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String drive() {
        return "Driving the " + make + " " + model;
    }
}
