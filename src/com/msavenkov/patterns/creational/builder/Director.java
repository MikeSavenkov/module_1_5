package com.msavenkov.patterns.creational.builder;

public class Director {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car buildCar() {
        builder.createCar();
        builder.buildPrice();
        builder.buildName();
        builder.buildTransmission();

        Car car = builder.getCar();
        return car;
    }
}
