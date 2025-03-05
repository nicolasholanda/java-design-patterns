package com.github.nicolasholanda.creational.model.standard;

import com.github.nicolasholanda.creational.model.Door;
import com.github.nicolasholanda.creational.model.Room;

/**
 * Concrete implementation of a door between two rooms in the maze.
 * This class represents a standard door with basic functionality.
 */
public class StandardDoor extends Door {

    /**
     * Creates a door between two rooms. By default, the door is closed.
     * 
     * @param room1 The first room the door connects to.
     * @param room2 The second room the door connects to.
     */
    public StandardDoor(Room room1, Room room2) {
        super(room1, room2);
    }

    /**
     * Attempts to enter the door. If the door is open, the player can pass through;
     * otherwise, a message is displayed indicating the door is closed.
     */
    @Override
    public void enter() {
        if (isOpen()) {
            System.out.println("You have passed through the door.");
        } else {
            System.out.println("The door is closed. You cannot pass through.");
        }
    }
}
