package com.msavenkov.patterns.creational.abstractfactory.usa_fabric;

import com.msavenkov.patterns.creational.abstractfactory.Engine;

public class DieselEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting diesel engine...");
    }
}
