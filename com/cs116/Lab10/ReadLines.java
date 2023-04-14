package com.cs116.Lab10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadLines {
    public static void main(String[] args) throws IOException {
        try {
            Scanner file = new Scanner(new File("data.txt"));
            int n = 0;
            while(file.hasNext()) {
                if(!file.nextLine().isEmpty())
                    n++;
            }
            System.out.println(n);
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        }
    }
}
