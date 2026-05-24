package com.msavenkov.patterns.creational.builder;

public class BmwCarBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName("BMW");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildPrice() {
        car.setPrice(10000);
    }
}
