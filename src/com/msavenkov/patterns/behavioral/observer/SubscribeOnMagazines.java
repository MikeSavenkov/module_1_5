package com.msavenkov.patterns.behavioral.observer;

public class SubscribeOnMagazines {
    public static void main(String[] args) {
        NewYorkTimesMagazine magazine = new NewYorkTimesMagazine();

        magazine.addMagazine("Magazine #1");
        magazine.addMagazine("Magazine #2");

        Observer firstSubscriber = new Subscriber("Ivan Ivanov");
        Observer secondSubscriber = new Subscriber("Petr Petrov");

        magazine.addObserver(firstSubscriber);
        magazine.addObserver(secondSubscriber);

        magazine.addMagazine("Magazine #3");

        magazine.removeMagazine("Magazine #1");
    }
}
