package com.msavenkov.patterns.creational.abstractfactory.usa_fabric;

import com.msavenkov.patterns.creational.abstractfactory.Wheels;

public class SummerWheels implements Wheels {
    @Override
    public void rotate() {
        System.out.println("rotate summer wheels...");
    }
}
