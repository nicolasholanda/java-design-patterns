package com.github.nicolasholanda.creational.builder;

import com.github.nicolasholanda.creational.model.*;
import com.github.nicolasholanda.creational.model.standard.*;

/**
 * Concrete builder for creating a maze and counting the number of rooms and doors.
 * This builder implements {@link MazeBuilder} and adds functionality
 * to track how many rooms and doors have been built.
 */
public class CountingMazeBuilder implements MazeBuilder {

    private Maze currentMaze;
    private int roomCount;
    private int doorCount;

    public CountingMazeBuilder() {
        currentMaze = new Maze();
        this.roomCount = 0;
        this.doorCount = 0;
    }

    /**
     * Builds the maze by initializing its structure.
     * This method creates a new maze and sets it up for further construction.
     */
    @Override
    public void buildMaze() {
        currentMaze = new Maze();
    }

    /**
     * Builds a room with the specified room number.
     * 
     * @param roomNumber The number of the room to be added.
     */
    @Override
    public void buildRoom(int roomNumber) {
        Room room = new StandardRoom(roomNumber);
        currentMaze.addRoom(room);
        roomCount++;
    }

    /**
     * Builds a door between two rooms in the maze.
     * <p>
     * This method creates a door between two rooms and increments the door count.
     * </p>
     * 
     * @param roomFrom The room from which the door originates.
     * @param roomTo The room to which the door leads.
     */
    @Override
    public void buildDoor(int roomFrom, int roomTo) {
        Room room1 = currentMaze.getRoom(roomFrom);
        Room room2 = currentMaze.getRoom(roomTo);
        Door door = new StandardDoor(room1, room2);
        room1.setSide(Direction.NORTH, door);
        room2.setSide(Direction.SOUTH, door);
        doorCount++;
    }

    /**
     * Returns the constructed maze.
     * 
     * @return The maze that has been constructed.
     */
    @Override
    public Maze getMaze() {
        return currentMaze;
    }

    /**
     * Returns the total number of rooms built.
     * 
     * @return The total number of rooms in the maze.
     */
    public int getRoomCount() {
        return roomCount;
    }

    /**
     * Returns the total number of doors built.
     * 
     * @return The total number of doors in the maze.
     */
    public int getDoorCount() {
        return doorCount;
    }
}
