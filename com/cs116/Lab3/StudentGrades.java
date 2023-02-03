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
            setRandomGrades();
        }
    }

    private void setRandomGrades() {
        grades = new int[students]; 
        for(int i = 0; i < grades.length; i++) {
            grades[i] = (int)(Math.random() * 100);
        }
    }

    public void setGrades(int x) {
        grades = new int[students]; 
        for(int i = 0; i < grades.length; i++) {
            grades[i] = x;
        }
    }

    public void sortHightoLow() {
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));
    }

    public void sortLowtoHigh() {
        Arrays.sort(grades);
        int last = grades.length - 1;
        for(int i = 0; i < grades.length / 2; i++) {
            int temp = grades[i];
            grades[i] = grades[last - i];
            grades[last - i] = temp;
        }
        System.out.println(Arrays.toString(grades));
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
        int mode = grades[0];
        int maxCount = 0;
        for(int i = 0; i < grades.length; i++) {
            int count = 1;
            for(int j = 0; j < grades.length; j++) {
                if(grades[j] == grades[i]) 
                    count++;
                if(count > maxCount) {
                    mode = grades[i];
                    maxCount = count;
                }
            }
        }
        return mode;
    }

    public boolean equals(StudentGrades other) {
        if(other instanceof StudentGrades) {
            if(other.students == students) {
                for(int i = 0; i < grades.length; i++) {
                    if(other.grades[i] == grades[i]) {
                    return true;
                    }
                }
            }
        }
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
