package com.msavenkov.patterns.behavioral.strategy;

import com.msavenkov.patterns.behavioral.state.Activity;

public class Car {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.action();
    }
}
