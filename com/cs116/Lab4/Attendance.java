package com.cs116.Lab4;

public class Attendance {
    public static void main(String[] args) {
        int[][] attendance = new int[4][5];
        for(int i = 0; i < attendance.length; i++) {
            for(int j = 0; j < attendance[i].length; j++) {
                attendance[i][j] = (int)(Math.random() * (50 - 40) + 40);
            }
        }

        printTable(attendance);
        printAverage(attendance);
    }

    public static void printTable(int[][] arr) {
        System.out.println("Week\tMon\tTue\tWed\tThru\tFri");
        for(int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + "\t");
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void printAverage(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            double average = 0;
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
            average = (double)(sum) / arr[i].length;
            System.out.println("Week: " + (i + 1) + ": " + average);
        }
    }
}
