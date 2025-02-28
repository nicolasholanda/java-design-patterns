package com.github.nicolasholanda.creational.model.enchanted;

import com.github.nicolasholanda.creational.model.Wall;

/**
 * Concrete implementation of a {@link Wall} that represents a magical wall.
 */
public class MagicWall extends Wall {

    /**
     * Constructor to initialize a magical wall.
     */
    public MagicWall() {
        super();
    }

    @Override
    public void enter() {
        System.out.println("Ouch! You have stumbled on a magic wall.");
    }
}
