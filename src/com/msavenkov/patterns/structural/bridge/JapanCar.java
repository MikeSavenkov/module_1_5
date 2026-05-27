package com.msavenkov.patterns.structural.bridge;

public class JapanCar implements Car{
    @Override
    public void startRace() {
        System.out.println("Japan car start race...");
    }
}
