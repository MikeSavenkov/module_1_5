package com.msavenkov.patterns.behavioral.mediator;

public interface Dispatcher {
    void sendMessage(String message, Aircraft aircraft);
}
