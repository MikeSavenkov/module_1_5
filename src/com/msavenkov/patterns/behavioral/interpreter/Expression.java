package com.msavenkov.patterns.behavioral.interpreter;

public interface Expression {
    boolean interpret(String context);
}
