package com.msavenkov.patterns.behavioral.command;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();

        Pilot pilot = new Pilot(
                new TurnLeftCommand(car),
                new TurnRightCommand(car),
                new GoBackCommand(car),
                new GoForwardCommand(car)
        );

        pilot.goBackCommand();
        pilot.goForwardCommand();
        pilot.turnLeftCommand();
        pilot.turnRightCommand();
    }
}
