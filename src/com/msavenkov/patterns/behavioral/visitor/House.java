package com.msavenkov.patterns.behavioral.visitor;

public class House implements HouseElement{
    HouseElement[] houseElements;

    public House() {
        this.houseElements = new HouseElement[] {
                new Fundament(),
                new Wall(),
                new Roof()
        };
    }

    @Override
    public void beMake(Builder builder) {
        for (HouseElement element : houseElements) {
            element.beMake(builder);
        }
    }
}
