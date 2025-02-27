package com.github.nicolasholanda.creational.model;

/**
 * Represents a door between two rooms.
 */
public class Door implements MapSite {

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
    public void enter() {
        if(isOpen) {
            System.out.println("You pass through the door.");
            return;
        }

        System.out.println("The door is closed.");
    }

    /**
     * Gets the other room connected by the door.
     * 
     * @param currentRoom The room the player is in.
     * @return The adjacent room.
     */
    public Room otherSideFrom(Room currentRoom) {
        return currentRoom == room1 ? room2 : room1;
    }

}
