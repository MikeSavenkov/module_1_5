package com.msavenkov.patterns.behavioral.command;

public class GoForwardCommand implements Command{
    Car car;

    public GoForwardCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.goForward();
    }
}
