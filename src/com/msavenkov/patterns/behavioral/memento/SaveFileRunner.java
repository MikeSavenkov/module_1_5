package com.msavenkov.patterns.behavioral.memento;

public class SaveFileRunner {
    public static void main(String[] args) throws InterruptedException {
        File file = new File();
        Computer computer = new Computer();

        System.out.println("Creating new file. Version 1");
        file.setVersionAndDate("Version 1");

        System.out.println(file);
        System.out.println("Saving current version to computer");
        computer.setSave(file.save());

        System.out.println("Updating file to version 2");
        Thread.sleep(2000);
        file.setVersionAndDate("Version 2");
        System.out.println(file);
        System.out.println("Something went wrong...");

        System.out.println("Rolling back to version 1");
        file.load(computer.getSave());
        System.out.println("File after rollback:");
        System.out.println(file);
    }
}
