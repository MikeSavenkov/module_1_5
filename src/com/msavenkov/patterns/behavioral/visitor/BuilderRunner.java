package com.msavenkov.patterns.behavioral.visitor;

public class BuilderRunner {
    public static void main(String[] args) {
        House house = new House();

        Builder cheap = new CheapBuilder();
        Builder expensive = new ExpensiveBuilder();

        System.out.println("cheap builder in Action...");
        house.beMake(cheap);
        System.out.println("\n===================================\n");
        System.out.println("expensive builder in Action...");
        house.beMake(expensive);
    }
}
