package com.msavenkov.patterns.creational.prototype;

public class HumanFactory {
    Human human;

    public void setHuman(Human human) {
        this.human = human;
    }

    public HumanFactory(Human human) {
        this.human = human;
    }

    Human cloneHuman() {
        return (Human) human.copy();
    }
}
