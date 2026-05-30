package com.msavenkov.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewYorkTimesMagazine implements Observed{
    List<String> magazines = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addMagazine(String magazine) {
        this.magazines.add(magazine);
        notifyObservers();
    }

    public void removeMagazine(String magazine) {
        this.magazines.remove(magazine);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(this.magazines);
        }
    }
}
