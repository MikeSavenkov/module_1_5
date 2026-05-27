package com.msavenkov.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        List<Car> cars = new ArrayList<>();
        cars.add(carFactory.getCarByCountry("europe"));
        cars.add(carFactory.getCarByCountry("europe"));
        cars.add(carFactory.getCarByCountry("europe"));
        cars.add(carFactory.getCarByCountry("europe"));
        cars.add(carFactory.getCarByCountry("russian"));
        cars.add(carFactory.getCarByCountry("russian"));
        cars.add(carFactory.getCarByCountry("russian"));
        cars.add(carFactory.getCarByCountry("russian"));

        for (Car car: cars) {
            car.move();
        }
    }
}
