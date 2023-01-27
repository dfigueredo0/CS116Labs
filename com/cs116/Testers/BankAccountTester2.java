package com.cs116.Testers;

import com.cs116.Lab2.BankAccount;

public class BankAccountTester2 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(100, "Alice", "Savings Account", 50);
        BankAccount account2 = new BankAccount(350, "Bob", "Shecking", 30);
        
        account2.withdraw(200);
        System.out.println(account2.getBalance());

        account1.deposit(50);
        System.out.println(account1.getBalance());
        
        account2.withdraw(1000); //Doesn't change balance as this amounnt is much greater than current bal and above overdraw limit
        System.out.println(account2.getBalance()); 

        account2.transfer(account1, 75);
        System.out.println(account1.getBalance());

        System.out.println(account1);
        System.out.println(account2);
    }
}
