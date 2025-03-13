package com.github.nicolasholanda.structural.decorator;

/**
 * The common interface for text components.
 * Defines the method to render text.
 */
public interface TextComponent {
    /**
     * Renders the text content.
     * @return the formatted text.
     */
    String render();
}
