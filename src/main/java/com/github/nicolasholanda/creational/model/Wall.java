package com.github.nicolasholanda.creational.model;

/**
 * Represents a wall in a maze.
 */
public class Wall implements MapSite {

    @Override
    public void enter() {
        System.out.println("You have hit a wall.");
    }

}
