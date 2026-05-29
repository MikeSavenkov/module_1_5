package com.msavenkov.patterns.behavioral.command;

public class Car {
    public void turnLeft() {
        System.out.println("Turning left...");
    }
    public void turnRight() {
        System.out.println("Turning right...");
    }
    public void goForward() {
        System.out.println("Going forward...");
    }
    public void goBack() {
        System.out.println("Going back");
    }
}
