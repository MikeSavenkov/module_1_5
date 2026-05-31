package com.msavenkov.patterns.behavioral.visitor;

public class Fundament implements HouseElement{
    @Override
    public void beMake(Builder builder) {
        builder.create(this);
    }
}
