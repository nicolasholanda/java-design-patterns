package com.github.nicolasholanda.structural.decorator;

/**
 * A concrete decorator that applies bold formatting.
 */
public class BoldDecorator extends TextDecorator {

    /**
     * Constructor for BoldDecorator.
     * @param component the TextComponent to be decorated.
     */
    public BoldDecorator(TextComponent component) {
        super(component);
    }

    /**
     * Renders the text with bold formatting.
     * @return the text wrapped in bold markers.
     */
    @Override
    public String render() {
        return "**" + super.render() + "**";
    }
}