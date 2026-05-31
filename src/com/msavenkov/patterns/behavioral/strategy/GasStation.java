package com.msavenkov.patterns.behavioral.strategy;

import com.msavenkov.patterns.behavioral.state.Activity;

public class GasStation implements Activity {
    @Override
    public void action() {
        System.out.println("Gas station...");
    }
}
