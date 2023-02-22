package com.cs116.Lab5;

public class TwoDTrace {
    public static void main(String[] args) {
        int[][] matrix; //initialize an empty 2D integer array with a reference name of matix
        matrix = new int [4][2]; //makes the martix to have 4 rows and two columns {{0, 0}, {0, 0}, {0,0}, {0,0}}
        matrix [3][0] = 15; // sets the third row and first column to be 15 {{0, 0}, {0, 0}, {15,0}, {0,0}}
        for (int i = 0; i < matrix.length; i ++) { //iterates through the amount of rows in matrix 1-4 stops at 3 and starts at 0
            for (int j = 0; j < matrix[i].length; j ++) { //iterate through the amount of columns in matirx 1-2 starts at 0 ends at 1
                System.out.print(matrix[i][j] + " "); 
                // ^ prints the value of each row and column, the first iteration being 0 and the value in the 4th(3) row and first(0) column being 15 
            }
            System.out.println(); //makes a new line after one integer is printed from the matrix
        }
        System.out.println(); //add a line to seperate the 2D being traversed and what the new one will be after the alteration of vlaues in the value lines. 
        for(int i = 0; i < matrix.length; i ++) { //traverses through the number of rows (<4)
            matrix[i] = new int[i+1]; //sets column size for each row, where it increments by 1 for every row, at the end the 4th row will have 4 columns 
        }
        for(int i = 0; i < matrix.length ; i ++) { //iterate through the amount of rows in matirx 1-4 starts at 0 ends at 3
            for(int j = 0; j < matrix[i].length; j ++) { //iterate through the amount of columns in matirx 1-4 starts at 0 ends at 3
                System.out.print(matrix[i][j] + " " ); // prints the value of each row and columns all values will be 0. 
            }
            System.out.println(); // seperates each row with a new line. 
        }
    }
}
