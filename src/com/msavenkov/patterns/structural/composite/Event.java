package com.msavenkov.patterns.structural.composite;

public class Event {
    public static void main(String[] args) {
        Race race = new Race();

        Car firstJapanCar = new JapanCar();
        Car secondJapanCar = new JapanCar();
        Car europeCar = new EuropeCar();

        race.addCar(firstJapanCar);
        race.addCar(secondJapanCar);
        race.addCar(europeCar);

        race.createEvent();
    }
}
