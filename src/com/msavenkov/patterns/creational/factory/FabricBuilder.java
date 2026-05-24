package com.msavenkov.patterns.creational.factory;

public class FabricBuilder implements Builder {
    @Override
    public void build() {
        System.out.println("Fabric Builder build fabric...");
    }
}
