package com.msavenkov.patterns.creational.builder;

public class MercedesCarBuilder extends CarBuilder{
    @Override
    void buildName() {
        car.setName("Mercedes");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildPrice() {
        car.setPrice(10500);
    }
}
