package com.cs116.Notes;

public class ReturnBooleanArray {
    public static void main(String[] args) {
		int[] array = {100, 99, 101, 50, 150, 88};
		
		System.out.print("The elements of the int array are ");
		
		for(int i = 0; i < array.length; i++)
			System.out.print( array[i] + " ");
		 
		System.out.println();
		
		boolean[] oneHundreds = intToBoolean(array);
		System.out.print("The elements of the boolean array are ");
		for(int i = 0; i < oneHundreds.length; i++)
		    System.out.print(oneHundreds[i] + " ");
		System.out.println();
	}

	public static boolean[] intToBoolean(int[] intArray) {
		
		// instantiate array to return; all elements are false
	    boolean[] tempArray = new boolean[intArray.length];
	    
	    for(int i = 0; i < intArray.length; i++)
		    if(intArray[i] >= 100)
		       tempArray[i] = true;
	    return tempArray;
 	}
}
