package com.msavenkov.patterns.behavioral.visitor;

public interface Builder {
    void create(Fundament fundament);
    void create(Wall wall);
    void create(Roof roof);
}
