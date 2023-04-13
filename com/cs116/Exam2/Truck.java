package com.cs116.Exam2;

public class Truck extends Vehicle {
    private int payloadCapacity;
    private int towingCapacity;

    public Truck(int payloadCapacity, int towingCapacity, String make, String model) {
        super(make, model);
        setPayloadCapacity(payloadCapacity);
        setTowingCapacity(towingCapacity);
    }

    private void setPayloadCapacity(int payloadCapacity) {
        if(payloadCapacity > 0) {
            this.payloadCapacity = payloadCapacity;
        }
    }

    private void setTowingCapacity(int towingCapacity) {
        if(towingCapacity > 0) {
            this.towingCapacity = towingCapacity;
        }
    }
    
    public int getPayloadCapacity() {
        return payloadCapacity;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    @Override
    public String drive() {
        return super.drive() + " with " + payloadCapacity + " payload capacity and " + towingCapacity + " towing capacity";
    }

    public String toString() {
        return "Payload Capacity: " + payloadCapacity + "\tTowing Capacity: " + towingCapacity;
    }
}
