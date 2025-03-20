package com.github.nicolasholanda.behavioral.command;

/**
 * Receiver class that performs actual text operations.
 */
public class TextEditor {
    public void copy() {
        System.out.println("Copying text");
    }

    public void paste() {
        System.out.println("Pasting text");
    }
}