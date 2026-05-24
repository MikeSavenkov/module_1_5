package com.msavenkov.patterns.creational.factory;

public class HouseBuilderFactory implements BuilderFactory {
    @Override
    public Builder createBuilder() {
        return new HouseBuilder();
    }
}
