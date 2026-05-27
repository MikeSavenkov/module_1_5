package com.msavenkov.patterns.structural.proxy;

public class CreditCard implements Payment{
    private int balance;
    private Cash cash;

    public CreditCard(int balance) {
        this.balance = balance;
    }

    @Override
    public void pay() {
        if (cash == null) {
            cash = new Cash(balance);
        }
        cash.pay();
    }
}
