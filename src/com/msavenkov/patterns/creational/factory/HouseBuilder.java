package com.msavenkov.patterns.creational.factory;

public class HouseBuilder implements Builder {
    @Override
    public void build() {
        System.out.println("House Builder build house...");
    }
}
