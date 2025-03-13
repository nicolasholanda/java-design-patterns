package com.github.nicolasholanda.structural.decorator;

/**
 * A concrete decorator that applies italic formatting.
 */
public class ItalicDecorator extends TextDecorator {

    /**
     * Constructor for ItalicDecorator.
     * @param component the TextComponent to be decorated.
     */
    public ItalicDecorator(TextComponent component) {
        super(component);
    }

    /**
     * Renders the text with italic formatting.
     * @return the text wrapped in italic markers.
     */
    @Override
    public String render() {
        return "*" + super.render() + "*";
    }
}
