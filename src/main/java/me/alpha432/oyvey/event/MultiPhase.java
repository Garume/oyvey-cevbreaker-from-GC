package me.alpha432.oyvey.event;

public interface MultiPhase<T extends oyveyEvent> {

    Phase getPhase();

    T nextPhase();
}