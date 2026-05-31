package com.msavenkov.patterns.behavioral.template;

public abstract class HouseTemplate {
    public void buildHouse() {
        System.out.println("Make fundament...");
        buildWall();
        System.out.println("Make roof...");
    }

    public abstract void buildWall();
}
