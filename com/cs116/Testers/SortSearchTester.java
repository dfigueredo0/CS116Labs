package com.cs116.Testers;

import java.util.Arrays;
import java.util.Scanner;
import com.cs116.Lab3.SortSearch;
//import org.apache.commons.text.RandomStringGenerator;

public class SortSearchTester {
    public static void main(String[] args) {
        SortSearch sorter = new SortSearch();
        try (Scanner input = new Scanner(System.in)) {
           // RandomStringGenerator generator = new RandomStringGenerator.Builder().withinRange('a', 'z').build();

            System.out.println("What would you like the size of the array be");
            int size = input.nextInt();
            if(size < 1) {
                System.out.println("The size of an array must be greater than one please input another number");
                size = input.nextInt();
            }
            
            int[] array = new int[size];
            String[] arr = new String[size];

            for(int i = 0; i < size; i++) {
                array[i] = (int)(Math.random() * (100 - 1) + 1);
              //  String random = generator.generate((int)(Math.random() * (10 - 3) + 3));
               // arr[i] = random;
            }

            System.out.print("Selection Sort (ascending order): "); 
            sorter.selectionSortA(array);
            System.out.print("Selection Sort (descending order): "); 
            sorter.selectionSortD(array);
            System.out.print("Insertion sort (ascending order): "); 
            sorter.insertionSortA(array);
            System.out.print("Insertion sort (descending order): "); 
            sorter.insertionSortD(array);

            System.out.print("Bubble Sort: "); sorter.bubbleSort(array);

            System.out.println(Arrays.toString(sorter.sortArrayofStrings(arr)));

            System.out.print("Shuffle: ");
            sorter.shuffle(array);

            System.out.println(sorter.find(array, array[(int)(Math.random() * (array.length - 1))]));
            
            System.out.println(sorter.binarySearch(array, array[(int)(Math.random() * (array.length - 1))]));
        }
    }
}
