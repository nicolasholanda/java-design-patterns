package com.github.nicolasholanda.behavioral.mediator;

/**
 * Mediator interface that defines communication between colleagues.
 */
public interface Mediator {
    /**
     * Sends a message to the appropriate colleague.
     *
     * @param message The message to be sent.
     * @param sender  The colleague sending the message.
     */
    void sendMessage(String message, Colleague sender);
}