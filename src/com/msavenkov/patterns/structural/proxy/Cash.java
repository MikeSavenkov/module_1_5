package com.msavenkov.patterns.structural.proxy;

public class Cash implements Payment{
    private int balance;

    public Cash(int balance) {
        this.balance = balance;
        checkBalance();
    }

    public void checkBalance() {
        System.out.println("Check balance... Balance: " + balance);
    }

    @Override
    public void pay() {
        System.out.println("Pay products...");
    }
}
