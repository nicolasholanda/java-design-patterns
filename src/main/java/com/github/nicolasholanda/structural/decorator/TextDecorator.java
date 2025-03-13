package com.github.nicolasholanda.structural.decorator;

/**
 * Abstract decorator for TextComponent.
 * Implements the same interface and delegates rendering to the wrapped component.
 */
public abstract class TextDecorator implements TextComponent {
    protected final TextComponent component;

    /**
     * Constructor for a text decorator.
     * @param component the TextComponent to be decorated.
     */
    public TextDecorator(TextComponent component) {
        this.component = component;
    }

    /**
     * Delegates rendering to the wrapped component.
     * @return the formatted text.
     */
    @Override
    public String render() {
        return component.render();
    }
}
