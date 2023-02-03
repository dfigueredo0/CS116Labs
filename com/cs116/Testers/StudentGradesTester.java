package com.cs116.Testers;

import com.cs116.Lab3.StudentGrades;

public class StudentGradesTester {
    public static void main(String[] args) {
        StudentGrades sGrades = new StudentGrades(15);
        StudentGrades sGrades2 = new StudentGrades(20);

        sGrades.sortHightoLow();
        sGrades.sortLowtoHigh();
        System.out.println(sGrades.getGradeAverage());
        System.out.println(sGrades.getGradeMedian());
        System.out.println(sGrades.getGradeMode());
        System.out.println(sGrades);

        sGrades.setStudents(20);
        System.out.println(sGrades);

        System.out.println("Are the two clases equal " + sGrades.equals(sGrades2));
    }
}