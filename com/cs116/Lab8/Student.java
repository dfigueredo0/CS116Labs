package com.cs116.Lab8;

public class Student extends Person {
    private int numCourses;
    private String[] courses;
    private int[] grades;

    public Student(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[30];
        grades= new int[30];
    }

    public void addCourseGrade(String course, int grade) {
        if(numCourses <= 30) {
            courses[numCourses] = course;
            grades[numCourses] = grade;
            numCourses++;
        } else {
            System.out.println("Student has taken more than 30 courses");
        }
    }

    public void printGrades() {
        for(int grade : grades) {
            System.out.println(grade);
        }
    }

    public double getAverageGrade() {
        double avg = 0;
        for(int i = 0; i < grades.length; i++) {
            avg += grades[i];
        }
        return (avg / grades.length);
    }
    
    public String toString() {
        return "Student: " + super.toString();
    }
}
