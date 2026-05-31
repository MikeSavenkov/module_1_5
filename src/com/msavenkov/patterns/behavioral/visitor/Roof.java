package com.msavenkov.patterns.behavioral.visitor;

public class Roof implements HouseElement{
    @Override
    public void beMake(Builder builder) {
        builder.create(this);
    }
}
