package com.msavenkov.patterns.behavioral.chain;

public class SmartHelper extends Helper{
    public SmartHelper(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("helping smart helper " + message);
    }
}
