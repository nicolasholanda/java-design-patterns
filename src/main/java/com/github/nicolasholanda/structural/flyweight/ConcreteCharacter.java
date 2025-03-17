package com.github.nicolasholanda.structural.flyweight;

/**
 * Stores the character itself (intrinsic state).
 */
class ConcreteCharacter implements CharacterFlyweight {
    private final char symbol;

    public ConcreteCharacter(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void render(String font, int size) {
        System.out.println("Rendering character '" + symbol + "' with font: " + font + " and size: " + size);
    }
}