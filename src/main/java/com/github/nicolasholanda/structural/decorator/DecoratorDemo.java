package com.github.nicolasholanda.structural.decorator;

/**
 * Demonstrates the usage of the Decorator pattern.
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        TextComponent text = new PlainText("Hello, World!");

        // Applying decorators
        TextComponent boldText = new BoldDecorator(text);
        TextComponent italicText = new ItalicDecorator(text);
        TextComponent boldItalicText = new BoldDecorator(new ItalicDecorator(text));

        // Output results
        System.out.println("Plain: " + text.render());
        System.out.println("Bold: " + boldText.render());
        System.out.println("Italic: " + italicText.render());
        System.out.println("Bold + Italic: " + boldItalicText.render());
    }
}