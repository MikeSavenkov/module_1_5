package com.msavenkov.patterns.creational.abstractfactory;

public interface CarFactory {
    Engine getEngine();
    Lighting getLighting();
    Wheels getWheels();
}
