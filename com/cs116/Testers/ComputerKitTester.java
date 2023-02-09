package com.cs116.Testers;

import com.cs116.Lab4.ComputerKit;
import com.cs116.Lab4.ComputerPart;

public class ComputerKitTester {
    public static void main(String[] args) {
        ComputerKit computerKit = new ComputerKit();

        computerKit.addPart(new ComputerPart("CPU", 249.99));
        computerKit.addPart(new ComputerPart("GPU", 649.99));
        computerKit.addPart(new ComputerPart("RAM", 42.99));
        computerKit.addPart(new ComputerPart("RAM",42.99));
        computerKit.addPart(new ComputerPart("PSU", 139.99));
        computerKit.addPart(new ComputerPart("MOBO", 459.99));
        computerKit.addPart(new ComputerPart("STORAGE", 119.99));

        System.out.println("Price Range: " + computerKit.getPriceRange());
        System.out.println("Contains CPU: " + computerKit.contains("CPU"));
        System.out.println("RAM count: " + computerKit.countItem("RAM"));
    }
}
