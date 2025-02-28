package com.github.nicolasholanda.creational.model.bombed;

import com.github.nicolasholanda.creational.model.Room;

/**
 * Concrete implementation of a Room in the bombed maze.
 * Represents a room that has been bombed, with a special explosive feature.
 */
public class RoomWithABomb extends Room {

    /**
     * Constructor to initialize a room with a bomb with a room number.
     * 
     * @param roomNumber The number of the room.
     */
    public RoomWithABomb(int roomNumber) {
        super(roomNumber); // Call the constructor of the parent class (Room)
    }

    /**
     * Overridden method to simulate the action of entering a room with a bomb.
     * Displays a message indicating the room is bombed.
     */
    @Override
    public void enter() {
        System.out.println("You have entered a room with a bomb!");
    }
}
