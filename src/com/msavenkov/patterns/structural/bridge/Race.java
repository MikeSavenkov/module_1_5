package com.msavenkov.patterns.structural.bridge;

public abstract class Race {
    protected Car car;

    protected Race(Car car) {
        this.car = car;
    }

    public abstract void startRace();
}
