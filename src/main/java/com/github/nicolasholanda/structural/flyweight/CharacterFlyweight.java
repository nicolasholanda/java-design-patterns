package com.github.nicolasholanda.structural.flyweight;

/**
 * Flyweight interface that defines the shared behavior.
 */
interface CharacterFlyweight {
    void render(String font, int size);
}
