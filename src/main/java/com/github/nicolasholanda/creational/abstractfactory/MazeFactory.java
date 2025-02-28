package com.github.nicolasholanda.creational.abstractfactory;

import com.github.nicolasholanda.creational.model.Door;
import com.github.nicolasholanda.creational.model.Room;
import com.github.nicolasholanda.creational.model.Wall;

/**
 * Abstract Factory that defines methods for creating various components of the maze:
 * rooms, doors, and walls.
 */
public interface MazeFactory {

     /**
     * Creates a Door between two rooms. This method will be implemented by subclasses
     * to create specific types of doors.
     * 
     * @param room1 The first room of the door.
     * @param room2 The second room of the door.
     * @return A Door object
     */
    Door createDoor(Room room1, Room room2);

    /**
     * Creates a Wall object. This method will be implemented by subclasses
     * to create specific types of walls.
     * 
     * @return A Wall object
     */
    Wall createWall();

    /**
     * Creates a Room with a given room number. This method will be implemented by subclasses
     * to create rooms with different characteristics.
     * 
     * @param roomNumber The number of the room.
     * @return A Room object
     */
    Room createRoom(int roomNumber);
}
