package com.cs116.Notes;

import java.util.Scanner;

public class ReadingDataIntoArray {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in);) {
            double[] cellBills = new double[6];
            
            for(int i = 0; i < cellBills.length; i++) {
                System.out.print( "Enter bill amount for month " + (i + 1) + "\t");
	            cellBills[i] = scan.nextDouble( ); //read current bill
	            System.out.println();
            }
        }
    }
}
