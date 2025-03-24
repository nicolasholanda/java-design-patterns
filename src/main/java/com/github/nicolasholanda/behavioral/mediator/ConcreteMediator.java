package com.github.nicolasholanda.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of the Mediator interface.
 * Manages communication between multiple colleagues.
 */
public class ConcreteMediator implements Mediator {
    private final List<Colleague> colleagues = new ArrayList<>();

    /**
     * Registers a colleague with the mediator.
     *
     * @param colleague The colleague to register.
     */
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
        colleague.setMediator(this);
    }

    @Override
    public void sendMessage(String message, Colleague sender) {
        for (Colleague colleague : colleagues) {
            if (colleague != sender) {
                colleague.receiveMessage(message);
            }
        }
    }
}
