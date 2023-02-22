package com.cs116.Testers;

import java.util.ArrayList;
import java.util.Arrays;

import com.cs116.Lab5.ArrayListMethods;

public class ArrayListMethodsTester {
    public static void main(String[] args) {
        ArrayList<String> capitalize = new ArrayList<>(Arrays.asList("airplanes, bathrooms, trucks"));
        ArrayList<String> remove = new ArrayList<>(Arrays.asList("airplanes" , "hello", "bathrooms", "world"));
        ArrayList<String> reverse = new ArrayList<>(Arrays.asList("reversed", "been", "has", "list", "the", "then", "sense", "makes", "this", "if"));

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 4, 8, 9, 11, 15, 17, 28, 41, 59));
        ArrayList<Integer> integers2 = new ArrayList<>(Arrays.asList(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81));
             
        ArrayListMethods aListMethods = new ArrayListMethods();

        aListMethods.reverse(reverse);
        System.out.println(reverse);

        aListMethods.capitalizePlurals(capitalize);
        System.out.println(capitalize);

        aListMethods.removePlurals(remove);
        System.out.println(remove);
        
        System.out.println(aListMethods.intersect(integers, integers2));
    }
}
