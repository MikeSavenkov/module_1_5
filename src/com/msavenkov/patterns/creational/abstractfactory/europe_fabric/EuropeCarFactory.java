package com.msavenkov.patterns.creational.abstractfactory.europe_fabric;

import com.msavenkov.patterns.creational.abstractfactory.CarFactory;
import com.msavenkov.patterns.creational.abstractfactory.Engine;
import com.msavenkov.patterns.creational.abstractfactory.Lighting;
import com.msavenkov.patterns.creational.abstractfactory.Wheels;

public class EuropeCarFactory implements CarFactory {
    @Override
    public Engine getEngine() {
        return new PetrolEngine();
    }

    @Override
    public Lighting getLighting() {
        return new RightHandLighting();
    }

    @Override
    public Wheels getWheels() {
        return new WinterWheels();
    }
}
