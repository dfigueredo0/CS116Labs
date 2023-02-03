package com.cs116.ExtraCredit;

public class CountElements {
    
    public static void main(String[] args) {
        int[] x = {1, 5, 9, -2, 3, 5, 1};
        
        for(int i = 0; i < x.length; i++) {
            System.out.println(countElement(x, x[i]));
        }
    }

    public static String countElement(int[] arr, int x) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                count++;
            }
        }
        return x + " appears " + count + " times";
    }
}