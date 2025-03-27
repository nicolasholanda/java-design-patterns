package com.github.nicolasholanda.behavioral.state;

/**
 * Represents a document that transitions through different states.
 */
public class Document {
    private DocumentState state;

    /**
     * Creates a new document in the Draft state.
     */
    public Document() {
        this.state = new DraftState();
    }

    /**
     * Sets the current state of the document.
     * 
     * @param state The new state of the document.
     */
    public void setState(DocumentState state) {
        this.state = state;
    }

    /**
     * Triggers the publish action, delegating to the current state.
     */
    public void publish() {
        state.publish(this);
    }
}
