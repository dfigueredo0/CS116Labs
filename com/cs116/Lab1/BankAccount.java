package com.cs116.Lab1;

public class BankAccount {
    private String accountID;
    private double balance;
    private String name;

    public BankAccount() {
        accountID = "0000";
        balance = 0.0;
        name = "unknown";
    }

    public BankAccount(String accID, double bal, String name) {
        accountID = accID;
        balance = bal;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit) {
        if(deposit > 0.0)
            balance += deposit;
    }

    public void withdraw(double withdrawal) {
        if(withdrawal <= balance && withdrawal > 0.0)
            balance -= withdrawal;
    }

    public String toString() {
        return "Account ID: " + accountID + ", Name: " + name + ", Balance: " + balance;
    }
}
