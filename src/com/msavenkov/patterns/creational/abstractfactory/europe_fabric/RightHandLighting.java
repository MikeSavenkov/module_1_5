package com.msavenkov.patterns.creational.abstractfactory.europe_fabric;

import com.msavenkov.patterns.creational.abstractfactory.Lighting;

public class RightHandLighting implements Lighting {
    @Override
    public void turnOn() {
        System.out.println("lighting for right hand");
    }
}
