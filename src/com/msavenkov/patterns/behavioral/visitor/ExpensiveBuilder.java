package com.msavenkov.patterns.behavioral.visitor;

public class ExpensiveBuilder implements Builder{
    @Override
    public void create(Fundament fundament) {
        System.out.println("Build good fundament");
    }

    @Override
    public void create(Wall wall) {
        System.out.println("Build good wall");
    }

    @Override
    public void create(Roof roof) {
        System.out.println("Build good roof");
    }
}
