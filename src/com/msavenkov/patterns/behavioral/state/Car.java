package com.msavenkov.patterns.behavioral.state;

public class Car {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Racing) {
            setActivity(new GasStation());
        } else if (activity instanceof GasStation) {
            setActivity(new PitStop());
        } else if (activity instanceof PitStop) {
            setActivity(new Racing());
        }
    }

    public void action() {
        activity.action();
    }
}
