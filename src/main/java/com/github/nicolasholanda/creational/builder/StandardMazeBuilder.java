package com.github.nicolasholanda.creational.builder;

import com.github.nicolasholanda.creational.model.Direction;
import com.github.nicolasholanda.creational.model.Door;
import com.github.nicolasholanda.creational.model.Maze;
import com.github.nicolasholanda.creational.model.Room;
import com.github.nicolasholanda.creational.model.standard.StandardDoor;
import com.github.nicolasholanda.creational.model.standard.StandardRoom;

/**
 * Concrete builder for creating a standard maze.
 * <p>
 * This builder implements the steps to construct a typical maze, including rooms
 * and doors between them. The maze structure built by this class is a simple,
 * predefined maze with standard features.
 * </p>
 */
public class StandardMazeBuilder implements MazeBuilder {

    private Maze currentMaze;

    public StandardMazeBuilder() {
        currentMaze = new Maze();
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
        currentMaze.addRoom(room); // Adds the room to the maze
    }

    /**
     * Builds a door between two rooms in the maze.
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
    }

    /**
     * Returns the constructed maze.
     * 
     * @return The maze created by this builder.
     */
    @Override
    public Maze getMaze() {
        return currentMaze;
    }
}
