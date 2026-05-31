package com.msavenkov.patterns.behavioral.template;

public class BrickHouse extends HouseTemplate {

    @Override
    public void buildWall() {
        System.out.println("Make brick wall...");
    }
}
