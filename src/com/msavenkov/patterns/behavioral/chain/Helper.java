package com.msavenkov.patterns.behavioral.chain;

public abstract class Helper {
    private int priority;
    private Helper nextHelper;

    public Helper(int priority) {
        this.priority = priority;
    }

    public void setHelper(Helper nextHelper) {
        this.nextHelper = nextHelper;
    }

    public void notify(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (nextHelper != null) {
            nextHelper.notify(message, level);
        }
    }

    public abstract void write(String message);
}
