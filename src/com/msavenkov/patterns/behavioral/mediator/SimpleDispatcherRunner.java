package com.msavenkov.patterns.behavioral.mediator;

public class SimpleDispatcherRunner {
    public static void main(String[] args) {
        SimpleDispatcher dispatcher = new SimpleDispatcher();

        Aircraft airplane = new Airplane(dispatcher, "airplane");
        Aircraft helicopter1 = new Helicopter(dispatcher, "helicopter1");
        Aircraft helicopter2 = new Helicopter(dispatcher, "helicopter2");

        dispatcher.setAirplane(airplane);
        dispatcher.addAircraftToDispatcher(helicopter1);
        dispatcher.addAircraftToDispatcher(helicopter2);

        helicopter1.sendMessage("Hello, I'm helicopter1 !!!");
        airplane.sendMessage("Hello, I'm airplane!");

    }
}
