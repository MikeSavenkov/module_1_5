package com.msavenkov.patterns.behavioral.visitor;

public class CheapBuilder implements Builder{
    @Override
    public void create(Fundament fundament) {
        System.out.println("Build bad fundament");
    }

    @Override
    public void create(Wall wall) {
        System.out.println("Build bad wall");
    }

    @Override
    public void create(Roof roof) {
        System.out.println("Build bad roof");
    }
}
