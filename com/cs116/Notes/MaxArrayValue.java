package com.cs116.Notes;

public class MaxArrayValue {
    public static void main(String[] args) {
        double[] cellBills = {};
        int maxIndex = 0; //Init to index of first element

        for(int i = 0; i < cellBills.length; i++) {
            if(cellBills[i] > cellBills[maxIndex])
                maxIndex = i; //Saves index of highest value 
            System.out.println("maxIndex "+ maxIndex);
        }

        System.out.println("The highest bill, " + cellBills[maxIndex] + ", was found at index " + maxIndex);
    }
}