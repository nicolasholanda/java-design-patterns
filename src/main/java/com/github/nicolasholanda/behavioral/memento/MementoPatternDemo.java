package com.github.nicolasholanda.behavioral.memento;

/**
 * Demonstrates the Memento pattern in action.
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // Set initial state and save it
        originator.setState("State 1");
        caretaker.addMemento(originator.saveState());

        // Change state and save again
        originator.setState("State 2");
        caretaker.addMemento(originator.saveState());

        // Change state again without saving
        originator.setState("State 3");

        System.out.println("Current State: " + originator.getState());

        // Restore to previous saved state
        originator.restoreState(caretaker.getMemento(0));
        System.out.println("Restored to: " + originator.getState());
    }
}
