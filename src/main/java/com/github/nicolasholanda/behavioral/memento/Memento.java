package com.github.nicolasholanda.behavioral.memento;

/**
 * The Memento class stores the state of an Originator.
 * It is immutable and does not allow modifications after creation.
 */
public class Memento {
    private final String state;

    /**
     * Constructs a new Memento with a given state.
     *
     * @param state The state to be saved.
     */
    public Memento(String state) {
        this.state = state;
    }

    /**
     * Retrieves the saved state.
     *
     * @return The stored state.
     */
    public String getState() {
        return state;
    }
}
