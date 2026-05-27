package com.msavenkov.patterns.structural.decorator;

public class CarDecorator implements Car{

    Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String moving() {
        return car.moving();
    }
}
