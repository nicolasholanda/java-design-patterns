package com.github.nicolasholanda.creational.singleton;

import com.github.nicolasholanda.creational.model.Door;
import com.github.nicolasholanda.creational.model.Room;
import com.github.nicolasholanda.creational.model.Wall;

/**
 * A maze factory that creates maze objects.
 */
public interface MazeFactory {

    /**
     * Creates a wall.
     * 
     * @return Created Wall
     */
    Wall createWall();

    /**
     * Creates a room.
     * 
     * @param roomNo Number to identify the room.
     * @return Created Room.
     */
    Room createRoom(int roomNo);

    /**
     * Creates a door.
     * 
     * @param room1 First room.
     * @param room2 Second room.
     * @return Created Door.
     */
    Door createDoor(Room room1, Room room2);
}
