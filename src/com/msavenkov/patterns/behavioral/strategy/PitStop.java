package com.msavenkov.patterns.behavioral.strategy;

import com.msavenkov.patterns.behavioral.state.Activity;

public class PitStop implements Activity {
    @Override
    public void action() {
        System.out.println("Pit stop...");
    }
}
