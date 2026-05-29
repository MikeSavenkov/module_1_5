package com.msavenkov.patterns.behavioral.command;

public class TurnRightCommand implements Command{
    Car car;

    public TurnRightCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.turnRight();
    }
}
