package com.github.nicolasholanda.behavioral.state;

public class DocumentEditorClient {

    public static void main(String[] args) {
        Document document = new Document();
        
        document.publish(); // Moves to Moderation
        document.publish(); // Moves to Published
        document.publish(); // Already Published
    }
}
