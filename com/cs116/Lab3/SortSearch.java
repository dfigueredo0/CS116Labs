package com.cs116.Lab3;

import java.util.Arrays;
import java.util.Random;

public class SortSearch {

    public void selectionSortA(int[] arr) {
        int min, temp;
        for(int i = 0; i < arr.length; i++) {
            min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            if(min != i) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public void selectionSortD(int[] arr) {
        int temp, max;  

        for(int i = 0; i < arr.length; i++) {
            max = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] > arr[max]) {
                    max = j;
                }
            }
            if(max != i) {
                temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
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

        System.out.println(Arrays.toString(arr));
    }
    
    public void insertionSortD(int[] arr) {
        int j, temp;

        for(int i = 1; i < arr.length; i++) {
            j = i;
            temp = arr[i];

            while(j != 0 && arr[j - 1] < temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
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

        System.out.println(Arrays.toString(arr));
    }

    public String[] sortArrayofStrings(String[] arr) {
        int j;
        String temp;
        for(int i = 1; i < arr.length; i++) {
            j = i;
            temp = arr[i];

            while(j != 0 && temp.length() > arr[i].length()) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }

    public void shuffle(int[] arr) {
        Random random = new Random();

        int j, temp;

        for(int i = arr.length - 1; i > 0; i--) {
            j = random.nextInt(i + 1);
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
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
