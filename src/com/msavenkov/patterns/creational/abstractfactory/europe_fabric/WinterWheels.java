package com.msavenkov.patterns.creational.abstractfactory.europe_fabric;

import com.msavenkov.patterns.creational.abstractfactory.Wheels;

public class WinterWheels implements Wheels {
    @Override
    public void rotate() {
        System.out.println("rotate winter wheels");
    }
}
