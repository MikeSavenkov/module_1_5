package com.msavenkov.patterns.structural.flyweight;

public class EuropeCar implements Car {
    @Override
    public void move() {
        System.out.println("Europe car moving...");
    }
}
