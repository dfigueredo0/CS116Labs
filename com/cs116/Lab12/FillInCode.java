package com.cs116.Lab12;

public class FillInCode {
    public static int foo(String s, char c) {
        if(s.length() == 0) {
            return 0;
        } else {
            int count = foo(s.substring(1), c);
            if(s.charAt(c) == c) {
                count++;
            }
            return count;
        }
    }
}
