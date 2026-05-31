package com.msavenkov.patterns.behavioral.state;

public class RacingDay {
    public static void main(String[] args) {
        Activity activity = new PitStop();
        Car car = new Car();

        car.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            car.action();
            car.changeActivity();
        }
    }
}
