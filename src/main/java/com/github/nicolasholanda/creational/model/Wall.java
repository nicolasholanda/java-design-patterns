package com.github.nicolasholanda.creational.model;

/**
 * Represents a wall in a maze.
 */
public abstract class Wall implements MapSite {

    @Override
    public abstract void enter();

}
