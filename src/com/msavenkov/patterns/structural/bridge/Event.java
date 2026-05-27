package com.msavenkov.patterns.structural.bridge;

public class Event {
    public static void main(String[] args) {
        Race[] races = {
                new RingRace(new JapanCar()),
                new SprintRace(new UsaCar())
        };

        for (Race race : races) {
            race.startRace();
        }
    }
}
