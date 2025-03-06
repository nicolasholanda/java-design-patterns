package com.github.nicolasholanda.creational.factorymethod;

import com.github.nicolasholanda.creational.model.Direction;
import com.github.nicolasholanda.creational.model.Door;
import com.github.nicolasholanda.creational.model.Maze;
import com.github.nicolasholanda.creational.model.Room;
import com.github.nicolasholanda.creational.model.Wall;

/**
 * The base class that defines Factory Methods for creating maze components.
 * Subclasses determine the specific types of rooms and doors used in the maze.
 */
public abstract class MazeGame {

    /**
     * Creates a room. Subclasses must override this method to specify
     * the type of room being created.
     *
     * @param roomNo The room number.
     * @return A new {@link Room} instance.
     */
    protected abstract Room createRoom(int roomNo);

    /**
     * Creates a door. Subclasses must override this method to specify
     * the type of door being created.
     *
     * @param room1 The first room connected by the door.
     * @param room2 The second room connected by the door.
     * @return A new {@link Door} instance.
     */
    protected abstract Door createDoor(Room room1, Room room2);

    /**
     * Creates a wall. Subclasses must override this method to specify
     * the type of wall being created.
     *
     * @return A new {@link Wall} instance.
     */
    protected abstract Wall createWall();

    /**
     * Generates a maze using the factory methods.
     *
     * @return A fully constructed Maze.
     */
    public Maze createMaze() {
        Maze maze = new Maze();
        Room room1 = createRoom(1);
        Room room2 = createRoom(2);
        Door door = createDoor(room1, room2);

        maze.addRoom(room1);
        room1.setSide(Direction.EAST, createWall());
        room1.setSide(Direction.WEST, door);
        room1.setSide(Direction.SOUTH, createWall());
        room1.setSide(Direction.NORTH, createWall());

        room2.setSide(Direction.EAST, createWall());
        room2.setSide(Direction.WEST, createWall());
        room2.setSide(Direction.SOUTH, door);
        room2.setSide(Direction.NORTH, createWall());
        
        return maze;
    }
}
