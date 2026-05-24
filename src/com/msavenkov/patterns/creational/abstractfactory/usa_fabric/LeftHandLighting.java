package com.msavenkov.patterns.creational.abstractfactory.usa_fabric;

import com.msavenkov.patterns.creational.abstractfactory.Lighting;

public class LeftHandLighting implements Lighting {
    @Override
    public void turnOn() {
        System.out.println("Lighting for left hand...");
    }
}
