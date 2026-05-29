package com.msavenkov.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleDispatcher implements Dispatcher{
    Aircraft airplane;
    List<Aircraft> aircrafts = new ArrayList<>();

    public Aircraft getAirplane() {
        return airplane;
    }

    public void setAirplane(Aircraft airplane) {
        this.airplane = airplane;
    }

    public void addAircraftToDispatcher(Aircraft aircraft) {
        this.aircrafts.add(aircraft);
    }

    @Override
    public void sendMessage(String message, Aircraft aircraft) {
        for (Aircraft ac : aircrafts) {
            if (ac != aircraft) {
                ac.getMessage(message);
            }
        }
        airplane.getMessage(message);
    }
}
