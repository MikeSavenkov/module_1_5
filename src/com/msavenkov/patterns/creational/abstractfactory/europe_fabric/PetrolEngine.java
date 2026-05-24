package com.msavenkov.patterns.creational.abstractfactory.europe_fabric;

import com.msavenkov.patterns.creational.abstractfactory.Engine;

public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("starting petrol engine...");
    }
}
