package com.cs116.Lab2;

public class BankAccount {
    private double balance;
    private String name;
    private String type;
    private double overdrawLimit;

    public BankAccount() {
        balance = 0.0;
        name = "John Doe";
        type = "Checking";
        overdrawLimit = 30.0;
    }

    public BankAccount(double balance, String name, String type, double overdrawLimit) {
        setBalance(balance);
        setName(name);
        setAccountType(type);
        setOverdrawLimit(overdrawLimit);
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountType() {
        return type;
    }

    public double getOverdrawLimit() {
        return overdrawLimit;
    }

    public void setBalance(double balance) {
        if(balance >= (0.0 - overdrawLimit))
            this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountType(String type) {
        if(type.equalsIgnoreCase("Checking") || type.equalsIgnoreCase("Savings Account"))
            this.type = type;
    }

    public void setOverdrawLimit(double overdrawLimit) {
        if(overdrawLimit >= 0.0)
            this.overdrawLimit = overdrawLimit;
    }

    public double withdraw(double amount) {
        double temp = balance - amount;
        if(type.equalsIgnoreCase("Saving Account")) { 
            if((temp - 3) > -overdrawLimit) {
                balance -= amount - 3;
                return amount;
            } else {
                return -1;
            }
        } else {
            if(temp > -overdrawLimit) {
                balance -= amount;
                return amount;
            } else {
                return -1;
            }
        }
    }

    public void deposit(double amount) {
        if(amount > 0)
            balance += amount;
    }

    public boolean transfer(BankAccount other, double amount) {
        double temp = balance - amount;
        if(temp > -overdrawLimit) {
            balance -= amount;
            other.deposit(amount);
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Account Type: " + type + ", Name: " + name + ", Balance: " + balance;
    }
}
