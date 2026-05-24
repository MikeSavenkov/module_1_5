package com.msavenkov.patterns.creational.factory;

public class FabricBuilderFactory implements BuilderFactory {
    @Override
    public Builder createBuilder() {
        return new FabricBuilder();
    }
}
