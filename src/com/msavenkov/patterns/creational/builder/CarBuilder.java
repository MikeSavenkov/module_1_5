package com.msavenkov.patterns.creational.builder;

public abstract class CarBuilder {
    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildName();
    abstract void buildTransmission();
    abstract void buildPrice();

    Car getCar() {
        return car;
    }
}
