package com.cs116.Lab8;

public class Teacher extends Person {
    private int numCourses;
    private String[] courses = {" ", " ", " ", " ", " "," "}; 
    
    public Teacher(String name, String address) {
        super(name, address);
        numCourses = 0;
    }

    public boolean addCourse(String course) {
        if(numCourses <= 6) {
                if(courses[numCourses].equals(course)) { 
                    return false;
                } else {
                    courses[numCourses] = course;
                }
            numCourses++;
        }
        return true;
    }

    public boolean removeCourse(String course) {
        if(numCourses <= 6) {
                if(courses[numCourses - 1].equals(course)) { 
                    return false;
                } else {
                    courses[numCourses] = course;
                }
            }
            numCourses--;
        return true;
    }

    public String toString() {
        return "Teacher: " + super.toString();
    }
    
}
