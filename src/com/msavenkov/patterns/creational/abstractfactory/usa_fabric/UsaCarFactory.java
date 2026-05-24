package com.msavenkov.patterns.creational.abstractfactory.usa_fabric;

import com.msavenkov.patterns.creational.abstractfactory.CarFactory;
import com.msavenkov.patterns.creational.abstractfactory.Engine;
import com.msavenkov.patterns.creational.abstractfactory.Lighting;
import com.msavenkov.patterns.creational.abstractfactory.Wheels;

public class UsaCarFactory implements CarFactory {
    @Override
    public Engine getEngine() {
        return new DieselEngine();
    }

    @Override
    public Lighting getLighting() {
        return new LeftHandLighting();
    }

    @Override
    public Wheels getWheels() {
        return new SummerWheels();
    }
}
