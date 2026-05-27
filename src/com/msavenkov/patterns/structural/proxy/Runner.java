package com.msavenkov.patterns.structural.proxy;

public class Runner {
    public static void main(String[] args) {
        CreditCard cash = new CreditCard(500);

        cash.pay();
    }
}
