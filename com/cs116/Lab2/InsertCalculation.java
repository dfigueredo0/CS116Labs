package com.cs116.Lab2;

public class InsertCalculation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(110, "Alice", "Savings Account", 0);

        System.out.println(applyInterest(account, 8, 5));
    }

    public static double applyInterest(BankAccount account, int years, double interestRate) {
        double balance = account.getBalance() * (1.0 + ((interestRate/100.0) * years));

        return balance;
    }
}
