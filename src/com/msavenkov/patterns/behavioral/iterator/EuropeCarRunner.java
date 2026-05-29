package com.msavenkov.patterns.behavioral.iterator;

public class EuropeCarRunner {
    public static void main(String[] args) {
        String[] options = {"ac", "cruise-control", "color-metallic"};

        EuropeCar europeCar = new EuropeCar("520i", options);

        Iterator iterator = europeCar.getIterator();
        System.out.println("Car: " + europeCar.getModel());
        System.out.println("Options: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
