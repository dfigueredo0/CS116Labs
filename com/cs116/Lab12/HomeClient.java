package com.cs116.Lab12;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.cs116.Lab11.Home;

public class HomeClient {
    public static void main(String[] args) {
        ArrayList<Home> homes = new ArrayList<>(); 

        homes.add(new Home(3, 2000, true));
        homes.add(new Home(2, 1500, false));
        homes.add(new Home(4, 3000, true));
        homes.add(new Home(3, 2500, false));
        homes.add(new Home(5, 4000, true));

        int numHomes = 0;
        try {
            FileWriter fw = new FileWriter("homes.txt" , false);
            PrintWriter pw = new PrintWriter(fw);
            for(Home home : homes) {
                pw.println((numHomes + 1) + ". " + home.toString());
                numHomes++;
            }
            pw.print("Number of Homes: " + numHomes);
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
}
