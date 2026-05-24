package com.msavenkov.patterns.creational.singleton;

public class Run {
    public static void main(String[] args) {
        System.out.println(Singleton.getSingleton().toString());
        System.out.println(Singleton.getSingleton().toString());
        System.out.println(Singleton.getSingleton().toString());
    }
}
