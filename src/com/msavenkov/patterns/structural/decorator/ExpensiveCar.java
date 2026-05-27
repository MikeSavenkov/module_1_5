package com.msavenkov.patterns.structural.decorator;

public class ExpensiveCar extends CarDecorator {

    public ExpensiveCar(Car car) {
        super(car);
    }

    public String turnOnExpensiveFunction() {
        return "Turn on cruise-control. ";
    }

    @Override
    public String moving() {
        return super.moving() + turnOnExpensiveFunction();
    }
}
