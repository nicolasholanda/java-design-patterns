package com.github.nicolasholanda.creational.builder;

import com.github.nicolasholanda.creational.model.Maze;

/**
 * This interface defines the methods for constructing the various parts of a maze,
 * including the maze itself, rooms, and doors. The concrete builder will implement 
 * the steps to create a specific representation of the maze.
 */
public interface MazeBuilder {
    
    /**
     * Builds the maze. This method will be called first to initialize the maze.
     */
    void buildMaze();
    
    /**
     * Builds a room with the specified room number.
     * 
     * @param roomNumber The number assigned to the room to be created.
     */
    void buildRoom(int roomNumber);
    
    /**
     * Builds a door between two rooms.
     * 
     * @param roomFrom The room number where the door starts.
     * @param roomTo The room number where the door leads to.
     */
    void buildDoor(int roomFrom, int roomTo);
    
    /**
     * Returns the constructed maze.
     * 
     * @return The final maze product built by the concrete builder.
     */
    Maze getMaze();
}

