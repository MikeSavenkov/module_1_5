package com.msavenkov.patterns.structural.decorator;

public class Race {
    public static void main(String[] args) {
        Car car = new LuxuryCar(new ExpensiveCar(new FastCar()));

        System.out.println(car.moving());
    }
}
