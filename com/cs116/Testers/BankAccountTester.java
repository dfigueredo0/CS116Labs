package com.cs116.Testers;

import com.cs116.Lab1.BankAccount;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount("0001", 1000, "John Doe");

        b1.deposit(100);
    
        System.out.println(b1.getBalance());
        System.out.println(b2.getBalance());

        System.out.println(b1.getName());
        System.out.println(b2.getName());

        b2.withdraw(200);

        System.out.println(b1);
        System.out.println(b2);
    }
}
