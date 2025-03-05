package com.github.nicolasholanda.creational.model.standard;

import com.github.nicolasholanda.creational.model.Wall;

/**
 * Concrete implementation of a wall in the maze.
 * This class represents a standard wall with basic functionality.
 */
public class StandardWall extends Wall {

    /**
     * Attempts to enter the wall. Since it's a wall, entry is not allowed.
     * This is a simple implementation that prints a message indicating failure.
     */
    @Override
    public void enter() {
        System.out.println("You can't enter the wall! It's solid.");
    }
}
