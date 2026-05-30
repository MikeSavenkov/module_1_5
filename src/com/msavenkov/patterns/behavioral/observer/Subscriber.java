package com.msavenkov.patterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> magazines) {
        System.out.println("Dear " + name + "\nWe have some changes in magazines:\n" + magazines +
                "\n===================================================");
    }
}
