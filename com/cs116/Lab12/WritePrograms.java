package com.cs116.Lab12;

public class WritePrograms {
    public static boolean search(int arr[], int size, int n) {
        if(n == arr.length) {
            return false;
        }
        if(arr[n] == size) {
            return true;
        }
        return search(arr, size, n + 1);
    }

    public static int fibonacci(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
    public static String repeatString(String s, int i) {
        if(i == 0) {
            return " ";
        } else {
            return s + "\n" + repeatString(s, i - 1);
        }
    }

    public static int power(int x, int y) {
        if(y == 0) {
            return 1;
        } else {
            return x * power(x, y - 1);
        }
    }
}
