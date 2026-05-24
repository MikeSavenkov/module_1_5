package com.msavenkov.patterns.creational.abstractfactory;

import com.msavenkov.patterns.creational.abstractfactory.europe_fabric.EuropeCarFactory;

public class EuropeSuperFabric {
    public static void main(String[] args) {
        CarFactory carFactory = new EuropeCarFactory();
        Engine engine = carFactory.getEngine();
        Lighting lighting = carFactory.getLighting();
        Wheels wheels = carFactory.getWheels();
        System.out.println("Creating europe super fabric...");
        engine.start();
        lighting.turnOn();
        wheels.rotate();
    }
}
