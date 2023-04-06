package com.cs116.Midterm;

import java.util.Arrays;

public class Problem2Client {
    public static void main(String[] args) {
		StudentGrades sg = new StudentGrades(10);
		/* in case randomly generating 10 grades is not feasible ,
		* you have the option to use a predefined array as input of grades ..
		*/
		System.out.println(" Grades : " + sg );
		System.out.println(" Sorted grades : " + Arrays.toString (sg.getSortedGrades()));
		System.out.println(" Highest grade : " + sg.getHighestGrade ());
		System.out.println(" Number of times the highest grade appears : " + sg.getHighestGrade());
		System.out.println(" Average grade : " + sg.getAverageGrade ());
		System.out.println(" Median grade : " + sg.getMedianGrade());
		System.out.println(" Mode : " + sg.getMode());
	}
}
