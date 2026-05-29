package com.msavenkov.patterns.behavioral.command;

public class TurnLeftCommand implements Command{
    Car car;

    public TurnLeftCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.turnLeft();
    }
}
