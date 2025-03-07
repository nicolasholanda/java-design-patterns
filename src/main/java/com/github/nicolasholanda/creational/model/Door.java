package com.github.nicolasholanda.creational.model;

/**
 * Represents a door between two rooms.
 */
public abstract class Door implements MapSite {

    private Room room1;
    private Room room2;
    private boolean isOpen;

    /**
     * Creates a door between two rooms.
     * Door is closed by default.
     * 
     * @param room1 The first room
     * @param room2 The second room.
     */
    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
        this.isOpen = false;
    }

    @Override
    public abstract void enter();

    /**
     * Gets the other room connected by the door.
     * 
     * @param currentRoom The room the player is in.
     * @return The adjacent room.
     */
    public Room otherSideFrom(Room currentRoom) {
        return currentRoom == room1 ? room2 : room1;
    }

    /**
     * Checks if the door is open.
     * 
     * @return True if the door is open, false if it is closed.
     */
    public boolean isOpen() {
        return isOpen;
    }

    /**
     * Opens the door.
     */
    public void open() {
        isOpen = true;
        System.out.println("The door is now open.");
    }

    /**
     * Closes the door.
     */
    public void close() {
        isOpen = false;
        System.out.println("The door is now closed.");
    }

    public Room getRoom1() {
        return this.room1;
    }

    public Room getRoom2() {
        return this.room2;
    }
}
