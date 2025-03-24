package com.github.nicolasholanda.behavioral.mediator;

/**
 * Abstract class representing a participant in communication.
 */
public abstract class Colleague {
    protected Mediator mediator;

    /**
     * Sets the mediator for this colleague.
     *
     * @param mediator The mediator to be assigned.
     */
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * Sends a message via the mediator.
     *
     * @param message The message to send.
     */
    public void sendMessage(String message) {
        if (mediator != null) {
            mediator.sendMessage(message, this);
        }
    }

    /**
     * Receives a message from another colleague.
     *
     * @param message The received message.
     */
    public abstract void receiveMessage(String message);
}

