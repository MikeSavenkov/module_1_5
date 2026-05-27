package com.msavenkov.patterns.structural.facade;

public class DrivingDay {
    Racer racer = new Racer();
    Drive drive = new Drive();
    Route route = new Route();

    public void startRace() {
        drive.driving();
        route.startRace();
        racer.drivingOnCar(route);
    }
}
