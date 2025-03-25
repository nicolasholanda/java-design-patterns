package com.github.nicolasholanda.behavioral.memento;

/**
 * The Originator class creates and restores its state using Memento objects.
 */
public class Originator {
    private String state;

    /**
     * Sets the current state of the Originator.
     *
     * @param state The new state to set.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the current state of the Originator.
     *
     * @return The current state.
     */
    public String getState() {
        return state;
    }

    /**
     * Saves the current state into a new Memento.
     *
     * @return A Memento containing the current state.
     */
    public Memento saveState() {
        return new Memento(state);
    }

    /**
     * Restores the state from a given Memento.
     *
     * @param memento The Memento containing the saved state.
     */
    public void restoreState(Memento memento) {
        this.state = memento.getState();
    }
}

