package com.msavenkov.patterns.behavioral.command;

public class Pilot {
    Command turnLeft;
    Command turnRight;
    Command goForward;
    Command goBack;

    public Pilot(Command turnLeft, Command turnRight, Command goForward, Command goBack) {
        this.turnLeft = turnLeft;
        this.turnRight = turnRight;
        this.goForward = goForward;
        this.goBack = goBack;
    }

    public void turnLeftCommand() {
        turnLeft.execute();
    }
    public void turnRightCommand() {
        turnRight.execute();
    }
    public void goForwardCommand() {
        goForward.execute();
    }
    public void goBackCommand() {
        goBack.execute();
    }
}
