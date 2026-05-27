package com.msavenkov.patterns.structural.facade;

public class Route {
    private boolean activeRace;

    public boolean isActiveRace() {
        return activeRace;
    }

    public void startRace() {
        System.out.println("Race is active");
        activeRace = true;
    }

    public void finishRace() {
        System.out.println("Race is not active");
        activeRace = false;
    }
}
