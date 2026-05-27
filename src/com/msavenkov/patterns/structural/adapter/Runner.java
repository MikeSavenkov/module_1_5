package com.msavenkov.patterns.structural.adapter;

public class Runner {
    public static void main(String[] args) {
        BankBankomat bankomat = new BankAdapter();
        bankomat.putMoney();
        bankomat.getMoney();
    }
}
