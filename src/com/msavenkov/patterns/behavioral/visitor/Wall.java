package com.msavenkov.patterns.behavioral.visitor;

public class Wall implements HouseElement{
    @Override
    public void beMake(Builder builder) {
        builder.create(this);
    }
}
