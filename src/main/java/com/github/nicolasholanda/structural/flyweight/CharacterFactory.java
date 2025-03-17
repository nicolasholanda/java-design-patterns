package com.github.nicolasholanda.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * FlyweightFactory: Manages shared instances of Flyweight objects.
 */
public class CharacterFactory {
    private final Map<Character, CharacterFlyweight> flyweights = new HashMap<>();

    /**
     * Returns a shared CharacterFlyweight instance for the given character.
     *
     * @param symbol The character to retrieve or create a flyweight for.
     * @return A shared instance of CharacterFlyweight.
     */
    public CharacterFlyweight getCharacter(char symbol) {
        flyweights.putIfAbsent(symbol, new ConcreteCharacter(symbol));
        return flyweights.get(symbol);
    }

    /**
     * Returns the number of unique flyweight objects in memory.
     *
     * @return The number of flyweight instances.
     */
    public int getFlyweightCount() {
        return flyweights.size();
    }
}