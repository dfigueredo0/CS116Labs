package com.cs116.Lab3;

import java.util.Arrays;

public class SortSearch {

    public void selectionSortA(int[] arr) {
        int temp;
        int max;  

        for(int i = 0; i < arr.length - 1; i++) {
            max = indexOfLargestElement(arr);

            temp = arr[max];
            arr[max] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public void selectionSortD(int[] arr) {
        int temp;
        int max;  

        for(int i = arr.length - 1; i <= 0; i++) {
            max = indexOfLargestElement(arr);

            temp = arr[max];
            arr[max] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
    
    public void insertionSortA(int[] arr) {
        int j, temp;

        for(int i = 1; i < arr.length; i++) {
            j = i;
            temp = arr[i];

            while(j != 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = temp;
        }
    }
    
    public void insertionSortD(int[] arr) {
        int j, temp;

        for(int i = arr.length-1; i <= 0; i--) {
            j = i;
            temp = arr[i];

            while(j != 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = temp;
        }
    }

    public void bubbleSort(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public String[] sortArrayofStrings(String[] arr) {
        
        return arr;
    }

    public void shuffle(int[] arr) {

    }

    public int find(int[] arr, int x) {
        int index = 0;
        Arrays.sort(arr);

        for(int i = 0; i < arr.length && arr[i] <= x; i++) {
            if(arr[i] == x) {
                index = i;
                return index;
            }
        }
        return -1;
    }

    public int binarySearch(int arr[], int x) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int index;

        while(endIndex >= startIndex) {
            index = (startIndex + endIndex) /2;
            if(arr[index] == x)
                return index;
            else if(arr[index] > x) {
                endIndex = index - 1;
            } else {
                startIndex = index + 1;
            }
        }
        return -1;
    }

    private int indexOfLargestElement(int[] arr) {
        int index = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[index]) {
                index = i;
            }
        }
        return index;
    }
}
