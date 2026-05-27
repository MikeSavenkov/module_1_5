package com.msavenkov.patterns.structural.facade;

public class Racer {
    public void drivingOnCar(Route route) {
        if (route.isActiveRace()) {
            System.out.println("Racer is driving...");
        } else {
            System.out.println("Racer is having lunch...");
        }
    }
}
