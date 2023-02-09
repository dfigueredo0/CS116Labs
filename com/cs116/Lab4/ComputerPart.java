package com.cs116.Lab4;

public class ComputerPart {
    private final String[] PARTS = {"CPU", "GPU", "PSU", "MOBO", "RAM", "STORAGE"};

    private String item;
    private double price;

    public ComputerPart(String item, double price) {
        setItem(item);
        setPrice(price);
    }

    public void setItem(String item) {
        for(String items : PARTS) {
            if(item.equals(items)) {
                this.item = item;
                break;
            }
        }
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        } else {
            this.price = 100;
        }
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }
}
