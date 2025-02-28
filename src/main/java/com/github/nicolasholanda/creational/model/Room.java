package com.github.nicolasholanda.creational.model;

/**
 * Represents the relationship between the components of a maze.
 * It stores the references to the other {@link MapSite} objects
 * and the room number.
 */
public abstract class Room implements MapSite {

    private final int roomNumber;
    private final MapSite[] sides = new MapSite[4];

    /**
     * Creates a room with a unique number.
     * 
     * @param roomNumber Identifier for this room.
     */
    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * Enters the room. If player is not allowed, their nose will get hurt.
     * Otherwise, player location will change to this room.
     */
    @Override
    public abstract void enter();

    /**
     * Gets the side of the room in the specified direction.
     * 
     * @param direction The direction to check.
     */
    public MapSite getSide(Direction direction) {
        return sides[direction.ordinal()];
    }

    /**
     * Sets a specific side of the room.
     * 
     * @param direction The direction to set.
     * @param site The {@link MapSite} to place on that side.
     */
    public void setSide(Direction direction, MapSite site) {
        sides[direction.ordinal()] = site;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }
}
