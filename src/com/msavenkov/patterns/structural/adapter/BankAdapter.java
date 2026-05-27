package com.msavenkov.patterns.structural.adapter;

public class BankAdapter extends BankOffice implements BankBankomat {
    @Override
    public void putMoney() {
        deposit();
    }

    @Override
    public void getMoney() {
        receive();
    }
}
