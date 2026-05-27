package com.msavenkov.patterns.structural.decorator;

public class FastCar implements Car{
    @Override
    public String moving() {
        return "Moving fast. ";
    }
}
