package com.cs116.Lab10;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Comparator {
    private String file1Path;
    private String file2Path;

    public Comparator(String file1Path, String file2Path) {
        this.file1Path = file1Path;
        this.file2Path = file2Path;
    }

    public boolean compareFiles() {
        try {
            Scanner file1 = new Scanner(new File(file1Path));
            Scanner file2 = new Scanner(new File(file2Path));
            while(file1.hasNextLine() && file2.hasNextLine()) {
                if(!(file1.nextLine().equals(file2.nextLine())))
                    return false;
            }

            if(file1.hasNextLine() || file2.hasNextLine())
                return false;
            file1.close();
            file2.close();
            return true;
        } catch(FileNotFoundException e) {
            System.out.println("File Not Found");
            return false;
        }
    }

    public int countLines() {
        int n = 0;
        try {
            Scanner file1 = new Scanner(new File(file1Path));
            Scanner file2 = new Scanner(new File(file2Path));
            while(file1.hasNextLine() && file2.hasNextLine()) {
                if(!(file1.nextLine().isEmpty() || file2.nextLine().isEmpty()))
                    n++;
            }

            while(file1.hasNextLine()) {
                n++;
                file1.nextLine();
            }

            while(file2.hasNextLine()) {
                n++;
                file2.nextLine();
            }

            file1.close();
            file2.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        }
        
        return n;
    }
}
