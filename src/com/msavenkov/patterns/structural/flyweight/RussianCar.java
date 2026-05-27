package com.msavenkov.patterns.structural.flyweight;

public class RussianCar implements Car{
    @Override
    public void move() {
        System.out.println("Russian car moving...");
    }
}
