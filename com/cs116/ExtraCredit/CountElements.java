package com.cs116.ExtraCredit;

import java.util.Arrays;

public class CountElements {
    
    public static void main(String[] args) {
        int[] x = {1, 5, 0, 2, 3, 5, 1};

        optimizedCountElements(x);
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

    public static void optimizedCountElements(int[] arr) {
        int values[][] = new int[2][arr.length + 2];
        for(int i = 0; i < arr.length; i++)
            values[0][i] = arr[i];

        for(int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++)
                if (arr[i] == j)
                    values[1][j]++;
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++)
        {
            if(values[1][i] == 1)
                System.out.print(i + " was entered " + values[1][i] + " time\n");
            else if(values[1][i] != 0)
                System.out.print(i + " was entered " + values[1][i] + " times\n");
        }
    }
}