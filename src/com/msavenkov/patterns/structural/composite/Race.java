package com.msavenkov.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }
    protected void removeCar(Car car) {
        cars.remove(car);
    }
    protected void createEvent() {
        System.out.println("Race starting...");
        for (Car car : cars) {
            car.startRace();
        }
    }
}
