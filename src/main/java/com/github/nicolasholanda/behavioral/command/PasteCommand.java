package com.github.nicolasholanda.behavioral.command;

/**
 * Concrete command for pasting text.
 */
public class PasteCommand implements Command {
    private final TextEditor editor;

    public PasteCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.paste();
    }
}