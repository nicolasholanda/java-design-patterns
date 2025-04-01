package com.github.nicolasholanda.behavioral.visitor;

/**
 * Represents a text element in the document.
 */
public class Text implements Element {
    private String content;

    /**
     * Constructs a Text element with the given content.
     * 
     * @param content The text content.
     */
    public Text(String content) {
        this.content = content;
    }

    /**
     * Gets the text content.
     * 
     * @return The text content.
     */
    public String getContent() {
        return content;
    }

    /**
     * Accepts a visitor to process this element.
     * 
     * @param visitor The visitor performing operations on the element.
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
