package com.cs116.Lab4;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("How many rows are in the first matrix");
            int rows = input.nextInt();
            System.out.println("How many columns are in the first matrix");
            int cols = input.nextInt();
            System.out.println("How many rows are in the second matrix");
            int row = input.nextInt();
            System.out.println("How many columns are in the second matrix");
            int col = input.nextInt();

            int matrixA[][] = new int[rows][cols];
            int matrixB[][] = new int[row][col];

            System.out.println("Enter Matrix A");
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    matrixA[i][j] = input.nextInt();
                }
            }
            
            System.out.println("Enter Matrix B");
            for(int k = 0; k < row; k++) {
                for(int l = 0; l < col; l++) {
                    matrixB[k][l] = input.nextInt();
                }
            }

            multiplyMatrix(rows, row, cols, col, matrixA, matrixB);
        }
    }

    public static void printMatrix(int m[][]) {
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void multiplyMatrix(int row, int row1, int col, int col1, int mA[][], int mB[][]) {
        if(row1 != col) {
            System.out.println("Multiplication not possible");
        } else {

            int mC[][] = new int[row][col1];

            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col1; j++) {
                    for(int k = 0; k < row1; k++) {
                        mC[i][j] += mA[i][k] * mB[k][j];
                    }
                }
            }
            System.out.println("Product of Martix A and B is");
            printMatrix(mC);
        }
    }
}
