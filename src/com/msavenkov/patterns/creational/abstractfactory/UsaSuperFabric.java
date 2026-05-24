package com.msavenkov.patterns.creational.abstractfactory;

import com.msavenkov.patterns.creational.abstractfactory.usa_fabric.UsaCarFactory;

public class UsaSuperFabric {
    public static void main(String[] args) {
        CarFactory carFactory = new UsaCarFactory();
        Engine engine = carFactory.getEngine();
        Lighting lighting = carFactory.getLighting();
        Wheels wheels = carFactory.getWheels();

        System.out.println("creating USA Super fabric...");
        engine.start();
        lighting.turnOn();
        wheels.rotate();
    }
}
