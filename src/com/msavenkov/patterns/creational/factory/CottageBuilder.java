package com.msavenkov.patterns.creational.factory;

public class CottageBuilder implements Builder {

    @Override
    public void build() {
        System.out.println("Cottage Builder build cottage...");
    }
}
