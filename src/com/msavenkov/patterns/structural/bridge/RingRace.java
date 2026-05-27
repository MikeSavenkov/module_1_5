package com.msavenkov.patterns.structural.bridge;

public class RingRace extends Race{
    protected RingRace(Car car) {
        super(car);
    }

    @Override
    public void startRace() {
        System.out.println("Starting ring race...");
        car.startRace();
    }
}
