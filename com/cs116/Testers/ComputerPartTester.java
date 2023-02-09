package com.cs116.Testers;

import com.cs116.Lab4.ComputerPart;

public class ComputerPartTester {
    public static void main(String[] args) {
        ComputerPart computerPart = new ComputerPart("CPU", 100);

        computerPart.setItem("GPU");
        computerPart.setPrice(500);

        System.out.println(computerPart.getItem());
        System.out.println(computerPart.getPrice());
    }
}
