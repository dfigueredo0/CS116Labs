package com.cs116.ExtraCredit;

import java.util.Arrays;

public class CountElements {
    
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 5, 2, 1, 3, 1, 2, 44, 11, 5};

        System.out.println(Arrays.toString(x));
        System.out.println(countElement(x));
    }

    public static String countElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > max) {
                max = Math.abs(arr[i]);
            }
        }

        int[] frequency = new int[max + 1];

        for(int i = 0; i <= max; i++) {
            frequency[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]);
            frequency[index]++;
        }

        for(int j = 0; j <= max; j++) {
            if(frequency[j] > 0) {
                str += (j + " occurs " + frequency[j] + " times\n");
            }
        }

        return str;
    }   
}