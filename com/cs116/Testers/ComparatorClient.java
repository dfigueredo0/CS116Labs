package com.cs116.Testers;

import com.cs116.Lab10.Comparator;

public class ComparatorClient {
    public static void main(String[] args) {
        Comparator c = new Comparator("data.txt", "data2.txt");

        System.out.println(c.compareFiles());
        System.out.println(c.countLines());
    }
}
