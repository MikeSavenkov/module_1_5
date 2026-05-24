package com.msavenkov.patterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        BuilderFactory builderFactory = createBuilderBySpeciality("cottage");
        Builder fabricBuilder = builderFactory.createBuilder();

        fabricBuilder.build();
    }

    static BuilderFactory createBuilderBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("house")) {
            return new HouseBuilderFactory();
        } else if (speciality.equalsIgnoreCase("fabric")) {
            return new FabricBuilderFactory();
        } else if (speciality.equalsIgnoreCase("cottage")) {
            return new CottageBuilderFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown speciality.");
        }
    }
}
