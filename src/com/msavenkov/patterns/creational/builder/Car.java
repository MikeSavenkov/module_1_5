package com.msavenkov.patterns.creational.builder;

public class Car {
    private String name;
    private int price;
    private Transmission transmission;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", transmission=" + transmission +
                '}';
    }
}
