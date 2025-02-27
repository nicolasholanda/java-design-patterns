package com.github.nicolasholanda.creational.model;

import java.util.HashMap;

/**
 * Manages a collection of {@link Room}.
 */
public class Maze {

    private final HashMap<Integer, Room> roomMap = new HashMap<>();

    /**
     * Adds a room to the maze if it is not present already.
     * 
     * @param room The room to be added to the maze.
     */
    public void addRoom(Room room) {
        int roomNumber = room.getRoomNumber();
        roomMap.putIfAbsent(roomNumber, room);
    }

    /**
     * Gets a room by its number.
     * 
     * @param roomNumber The room identification number.
     * @return Room identified by roomNumber if present. Otherwise, null.
     */
    public Room getRoom(int roomNumber) {
        return roomMap.get(roomNumber);
    }
}
