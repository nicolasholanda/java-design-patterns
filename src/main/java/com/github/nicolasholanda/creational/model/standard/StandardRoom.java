package com.github.nicolasholanda.creational.model.standard;

import com.github.nicolasholanda.creational.model.Room;

/**
 * Concrete implementation of a room in the maze.
 * This class represents a standard room with basic functionality.
 * The room has a number and a set of sides, each of which can be a {@link MapSite}.
 */
public class StandardRoom extends Room {

    /**
     * Creates a room with a unique number.
     * 
     * @param roomNumber Identifier for this room.
     */
    public StandardRoom(int roomNumber) {
        super(roomNumber);
    }

    /**
     * Enters the room. This is a simple implementation that prints a message.
     * <p>
     * In a more advanced maze, this could represent a player entering the room
     * and triggering other events.
     * </p>
     */
    @Override
    public void enter() {
        System.out.println("You have entered room " + getRoomNumber());
    }
}
