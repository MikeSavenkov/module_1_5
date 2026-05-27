package com.msavenkov.patterns.structural.bridge;

public class UsaCar implements Car{
    @Override
    public void startRace() {
        System.out.println("Usa car start race...");
    }
}
