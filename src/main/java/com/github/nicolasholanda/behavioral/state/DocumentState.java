package com.github.nicolasholanda.behavioral.state;

/**
 * Represents a state in the document workflow.
 */
public interface DocumentState {
    /**
     * Handles the publishing action for the document.
     * 
     * @param document The document whose state is being handled.
     */
    void publish(Document document);
}

