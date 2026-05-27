package com.msavenkov.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private static final Map<String, Car> cars = new HashMap<>();

    public Car getCarByCountry(String country) {
        Car car = cars.get(country);

        if (car == null) {
            switch (country) {
                case "russian":
                    System.out.println("Buying russian car...");
                    car = new RussianCar();
                    break;
                case "europe":
                    System.out.println("Buying europe car...");
                    car = new EuropeCar();
            }
            cars.put(country, car);
        }
        return car;
    }
}
