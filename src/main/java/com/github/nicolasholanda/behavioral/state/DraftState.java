package com.github.nicolasholanda.behavioral.state;
/**
 * Represents the Draft state of a document.
 */
public class DraftState implements DocumentState {

    @Override
    public void publish(Document document) {
        System.out.println("Document sent for moderation.");
        document.setState(new ModerationState());
    }
}
