package com.github.nicolasholanda.behavioral.mediator;

/**
 * Concrete implementation of a Colleague.
 * Represents a user in a chat system.
 */
public class ConcreteColleague extends Colleague {
    private final String name;

    /**
     * Constructor to create a new colleague with a name.
     *
     * @param name The name of the colleague.
     */
    public ConcreteColleague(String name) {
        this.name = name;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " received: " + message);
    }
}
