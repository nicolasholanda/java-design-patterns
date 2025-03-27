package com.github.nicolasholanda.behavioral.state;

/**
 * Represents the Moderation state of a document.
 */
public class ModerationState implements DocumentState {

    @Override
    public void publish(Document document) {
        System.out.println("Document approved and published.");
        document.setState(new PublishedState());
    }
}

