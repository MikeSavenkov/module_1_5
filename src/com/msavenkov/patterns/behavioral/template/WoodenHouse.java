package com.msavenkov.patterns.behavioral.template;

public class WoodenHouse extends HouseTemplate{

    @Override
    public void buildWall() {
        System.out.println("Make wooden wall...");
    }
}
