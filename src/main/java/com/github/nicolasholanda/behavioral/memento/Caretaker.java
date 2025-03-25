package com.github.nicolasholanda.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * The Caretaker class manages Memento objects, storing multiple saved states.
 */
public class Caretaker {
    private final List<Memento> mementos = new ArrayList<>();

    /**
     * Adds a Memento to the list.
     *
     * @param memento The Memento to store.
     */
    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

    /**
     * Retrieves a Memento from the list by index.
     *
     * @param index The index of the Memento to retrieve.
     * @return The Memento at the specified index.
     */
    public Memento getMemento(int index) {
        return mementos.get(index);
    }
}
