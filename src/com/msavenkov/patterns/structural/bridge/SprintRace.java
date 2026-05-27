package com.msavenkov.patterns.structural.bridge;

public class SprintRace extends Race {

    protected SprintRace(Car car) {
        super(car);
    }

    @Override
    public void startRace() {
        System.out.println("Starting sprint race...");
        car.startRace();
    }
}
