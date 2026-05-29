package com.msavenkov.patterns.behavioral.command;

public class GoBackCommand implements Command{
    Car car;

    public GoBackCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.goBack();
    }
}
