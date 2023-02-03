package com.cs116.Lab3;

import java.util.Arrays;

public class StudentGrades {
    private int students;
    private int[] grades;

    public StudentGrades(int students) {
        setStudents(students);
    }

    public int getStudents() {
        return students;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setStudents(int x) {
        if(x > 0) {
            students = x;
            setGrades();
        }
    }

    private void setGrades() {
        grades = new int[students]; 
        for(int i = 0; i < grades.length; i++) {
            grades[i] = (int)(Math.random() * 100);
        }
    }

    public void sortHightoLow() {
        Arrays.sort(grades);
        System.out.print("[ ");
        for(int i = 0; i < grades.length - 1; i++) {
            System.out.print(grades[i] + ", ");
        }
        System.out.println(grades[grades.length - 1] + " ]");
    }

    public void sortLowtoHigh() {
        Arrays.sort(grades);
        for(int i = 0; i < grades.length / 2; i++) {
            int temp = grades[i];
            grades[i] = grades[(grades.length / 2) - i - 1];
            grades[(grades.length / 2) - i - 1] = temp;
        }
        System.out.print("[ ");
        for(int i = 0; i < grades.length - 1; i++) {
            System.out.print(grades[i] + ", ");
        }
        System.out.println(grades[grades.length-1] + " ]");
    }

    public int highestGrade() {
        int index = 0;
        for(int i = 0; i < grades.length; i++) {
            if(grades[i] > grades[index]) {
                index = i;
            }
        }
        return grades[index];
    }

    public double getGradeAverage() {
        int sum = 0;
        for(int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        double average = sum / grades.length;
        return average;
    }

    public int getGradeMedian() {
        Arrays.sort(grades);
        int median = grades.length / 2;
        return grades[median];
    }

    public int getGradeMode() {
        int maxKey = 0;
        int maxCounts = 0;
        return 0;
    }

    public boolean equals(StudentGrades other) {
        return false;
    }

    public String toString() {
        String str = "";
        for(int grade : grades) {
            str += grade + " ";
        }
        return "There are " + students + " in the class and all their grades are " + str;
    }
}
