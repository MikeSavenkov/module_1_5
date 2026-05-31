package com.msavenkov.patterns.behavioral.template;

public class BuildHouseRunner {
    public static void main(String[] args) {
        HouseTemplate brickHouse = new BrickHouse();
        HouseTemplate woodenHouse = new WoodenHouse();

        brickHouse.buildHouse();
        System.out.println("\n================================\n");
        woodenHouse.buildHouse();
    }
}
