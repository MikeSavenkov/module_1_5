package com.msavenkov.patterns.creational.factory;

public class CottageBuilderFactory implements BuilderFactory{
    @Override
    public Builder createBuilder() {
        return new CottageBuilder();
    }
}
