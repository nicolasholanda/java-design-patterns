package com.github.nicolasholanda.creational.model.bombed;

import com.github.nicolasholanda.creational.model.Door;
import com.github.nicolasholanda.creational.model.Room;

/**
 * Concrete implementation of a Door that can be exploded to pass through.
 * Represents a door in the maze that can only be passed through after it is exploded.
 */
public class ExplosiveDoor extends Door {

    private boolean isExploded;

    /**
     * Constructor to initialize an explosive door between two rooms.
     * The door is initially not exploded.
     * 
     * @param room1 The first room of the door.
     * @param room2 The second room of the door.
     */
    public ExplosiveDoor(Room room1, Room room2) {
        super(room1, room2);
        this.isExploded = false;  // The door is not exploded initially
    }

    /**
     * Method to simulate the explosion of the door.
     * The door becomes passable once it has been exploded.
     */
    public void explode() {
        if (!isExploded) {
            isExploded = true;
            System.out.println("The door has been exploded and is now passable.");
        } else {
            System.out.println("The door is already destroyed.");
        }
    }

     /**
     * Overridden method to attempt passing through the explosive door.
     * The door is passable only if it has been exploded.
     */
    @Override
    public void enter() {
        if (isExploded) {
            System.out.println("You have passed through the exploded door!");
        } else {
            System.out.println("This door is not exploded yet. You need to explode it first!");
        }
    }
}
