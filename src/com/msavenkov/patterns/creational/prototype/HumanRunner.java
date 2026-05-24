package com.msavenkov.patterns.creational.prototype;

public class HumanRunner {
    public static void main(String[] args) {
        Human human = new Human("Mike", 10, "Developer");

        System.out.println(human);

        HumanFactory factory = new HumanFactory(human);
        Human humanClone = factory.cloneHuman();

        System.out.println(humanClone);
    }
}
