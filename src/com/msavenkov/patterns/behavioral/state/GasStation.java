package com.msavenkov.patterns.behavioral.state;

public class GasStation implements Activity{
    @Override
    public void action() {
        System.out.println("Gas station...");
    }
}
