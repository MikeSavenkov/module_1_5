package com.msavenkov.patterns.behavioral.mediator;

public class Airplane implements Aircraft{
    Dispatcher dispatcher;
    String name;

    public Airplane(Dispatcher dispatcher, String name) {
        this.dispatcher = dispatcher;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        dispatcher.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " receiving message: " + message + ".");
    }
}
