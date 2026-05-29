package com.msavenkov.patterns.behavioral.chain;

public class SimpleHelper extends Helper{
    public SimpleHelper(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Helping with problem " + message);
    }
}
