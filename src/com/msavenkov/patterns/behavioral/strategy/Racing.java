package com.msavenkov.patterns.behavioral.strategy;

import com.msavenkov.patterns.behavioral.state.Activity;

public class Racing implements Activity {
    @Override
    public void action() {
        System.out.println("Racing...");
    }
}
