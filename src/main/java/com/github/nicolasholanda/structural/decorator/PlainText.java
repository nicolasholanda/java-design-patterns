package com.github.nicolasholanda.structural.decorator;

/**
 * A concrete implementation of TextComponent.
 * Represents plain text without any formatting.
 */
public class PlainText implements TextComponent {
    private final String content;

    /**
     * Constructor for PlainText.
     * @param content the text content.
     */
    public PlainText(String content) {
        this.content = content;
    }

    /**
     * Renders the plain text.
     * @return the unformatted text content.
     */
    @Override
    public String render() {
        return content;
    }
}
