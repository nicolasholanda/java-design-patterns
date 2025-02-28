package com.github.nicolasholanda.creational.model.bombed;

import com.github.nicolasholanda.creational.model.Wall;

/**
 * Concrete implementation of a Wall that is bombed.
 */
public class BombedWall extends Wall {


    /**
     * Constructor to initialize a bombed wall.
     */
    public BombedWall() {
        super();
    }

    /**
     * Method to attempt passing through the bombed wall.
     */
    @Override
    public void enter() {
        System.out.println("Boom! You hit a bombed wall.");
    }

}
