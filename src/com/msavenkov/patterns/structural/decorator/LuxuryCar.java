package com.msavenkov.patterns.structural.decorator;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car car) {
        super(car);
    }

    public String turnOnSeatMassage() {
        return "Turn on seat message.";
    }

    @Override
    public String moving() {
        return super.moving() + turnOnSeatMassage();
    }
}
