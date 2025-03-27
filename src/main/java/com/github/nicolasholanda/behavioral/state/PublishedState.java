package com.github.nicolasholanda.behavioral.state;

/**
 * Represents the Published state of a document.
 */
public class PublishedState implements DocumentState {

    @Override
    public void publish(Document document) {
        System.out.println("Document is already published.");
    }
}
