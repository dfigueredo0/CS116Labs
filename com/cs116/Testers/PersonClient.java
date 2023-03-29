package com.cs116.Testers;

import com.cs116.Lab8.Person;
import com.cs116.Lab8.Student;
import com.cs116.Lab8.Teacher;

public class PersonClient {
    public static void main(String[] args) {
        Person p = new Person("John", "123 W. Street St.");
        Student s = new Student("Jane", "456 W. Street St.");
        Teacher t = new Teacher("Joe", "789 W. Street St.");

        System.out.println(p.getAddress());
        p.setAddress("078 N. Street St.");
        System.out.println(p.getName());
        System.out.println(p);

        System.out.println(s);
        s.addCourseGrade("Math 251", 86);
        s.printGrades();
        s.setAddress("078 N. Street St.");
        System.out.println(s.getAddress());
        System.out.println(s.getAverageGrade());

        System.out.println(t);
        t.setAddress("078 N. Street St.");
        System.out.println(t.getAddress());
        System.out.println(t.addCourse("Math 251"));
        System.out.println(t.removeCourse("Math 251"));
    }
}
