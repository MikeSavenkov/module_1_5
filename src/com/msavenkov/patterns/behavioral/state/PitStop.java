package com.msavenkov.patterns.behavioral.state;

public class PitStop implements Activity {

    @Override
    public void action() {
        System.out.println("Pit stop...");
    }
}
