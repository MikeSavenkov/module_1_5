package com.msavenkov.patterns.behavioral.memento;

public class Computer {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
