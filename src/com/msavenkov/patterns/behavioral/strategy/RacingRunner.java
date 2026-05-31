package com.msavenkov.patterns.behavioral.strategy;

import com.msavenkov.patterns.behavioral.state.GasStation;
import com.msavenkov.patterns.behavioral.state.Racing;

public class RacingRunner {
    public static void main(String[] args) {
        Car car = new Car();

        car.setActivity(new PitStop());
        car.executeActivity();

        car.setActivity(new Racing());
        car.executeActivity();

        car.setActivity(new GasStation());
        car.executeActivity();
    }
}
