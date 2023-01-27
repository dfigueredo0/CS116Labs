package com.cs116.Notes;

import java.util.Scanner;

public class BinarySeacher {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 7, 8, 12, 15, 22, 36, 45, 48, 51, 53, 64, 69, 72, 89, 95};

    try (Scanner scan = new Scanner(System.in)) {
        System.out.print("Enter a value to search for > ");
        int key = scan.nextInt();

        int index = binarySearch(numbers, key);
        if (index != -1)
            System.out.println(key + " found at index " + index);
        else
            System.out.println(key + " not found");
        }
    }

    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int middle;

        while (end >= start) {
            middle = (start + end)/ 2; // element in middle of array

            if(arr[middle] == key) {
                return middle;       // key found at middle
            }
            else if(arr[middle] > key) {
                end = middle - 1;   // search left side of array
            }
            else {
                start = middle + 1; // search right side of array
            }
        }
        return -1;
    }
}
