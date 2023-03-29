package com.cs116.Lab8;

public class Person {
    protected String name;
    protected String address;

    public Person(String name, String address) {
        this.name = name;
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return name + " (" + address + ")";
    }
}
