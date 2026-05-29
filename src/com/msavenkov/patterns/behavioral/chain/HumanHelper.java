package com.msavenkov.patterns.behavioral.chain;

public class HumanHelper extends Helper{
    public HumanHelper(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Helping human helper with " + message);
    }
}
