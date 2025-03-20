package com.github.nicolasholanda.behavioral.command;

public class TextEditorClient {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        
        Command copy = new CopyCommand(editor);
        Command paste = new PasteCommand(editor);
        
        Button copyButton = new Button();
        Button pasteButton = new Button();
        
        copyButton.setCommand(copy);
        pasteButton.setCommand(paste);
        
        // Simulating button clicks
        copyButton.click();
        pasteButton.click();
    }
}
