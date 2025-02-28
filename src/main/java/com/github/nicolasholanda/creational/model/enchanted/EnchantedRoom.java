package com.github.nicolasholanda.creational.model.enchanted;

import com.github.nicolasholanda.creational.model.Room;

/**
 * Concrete implementation of a Room in the enchanted maze.
 * Represents a magical room with special properties.
 */
public class EnchantedRoom extends Room {

    /**
     * Constructor to initialize an enchanted room with a room number and magic power level.
     * 
     * @param roomNumber The number of the room.
     */
    public EnchantedRoom(int roomNumber) {
        super(roomNumber);
    }
    

    /**
     * Overridden method to simulate the action of entering an enchanted room.
     */
    @Override
    public void enter() {
        System.out.println("You have entered an enchanted room!");
    }
}
