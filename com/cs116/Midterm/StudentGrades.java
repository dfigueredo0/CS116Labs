package com.cs116.Midterm;

import java.util.Arrays;

public class StudentGrades {
    private int students;
    private int[] grades;
    public StudentGrades(int students) {
        setStudents(students);
        setGrades(students);
    }

    public void setStudents(int students) {
        if(students > 0) {
            this.students = students;
        }
    }

    public void setGrades(int students) {
        grades = new int[students];
        for(int i = 0; i < grades.length; i++) {
            grades[i] = (int)(Math.random() * 100);
        }
    }

    public int getStudents() {
        return students;
    }

    public int[] getGrades() {
        return grades;
    }

    public int[] getSortedGrades() {
        Arrays.sort(grades);
        return grades;
    }

    public int getHighestGrade() {
        int index = 0;
        for(int i = 0; i < grades.length; i++) {
            if(grades[i] > grades[index]) {
                index = i;
            }
        }
        return grades[index];
    }

    public double getAverageGrade() {
        double sum = 0;
        for(int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        double average = sum / grades.length;
        return average;
    }

    public double getMedianGrade() {
        Arrays.sort(grades);
        int median = grades.length / 2;
        double average = 0;
        if(grades.length % 2 != 0) {
            return grades[median];
        } else {
            average = ((double)grades[median - 1] + grades[median])/2;
            return average;
        }
    }

    public int getMode() {
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

    public String toString() {
        return Arrays.toString(grades);
    }
}
