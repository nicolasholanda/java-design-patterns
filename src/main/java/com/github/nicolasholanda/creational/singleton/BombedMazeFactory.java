package com.github.nicolasholanda.creational.singleton;

import com.github.nicolasholanda.creational.model.Door;
import com.github.nicolasholanda.creational.model.Room;
import com.github.nicolasholanda.creational.model.Wall;
import com.github.nicolasholanda.creational.model.bombed.BombedWall;
import com.github.nicolasholanda.creational.model.bombed.ExplosiveDoor;
import com.github.nicolasholanda.creational.model.bombed.RoomWithABomb;

/**
 * A singleton factory to produce bombed maze objects.
 */
public class BombedMazeFactory implements MazeFactory {

    // Singleton instance
    private static BombedMazeFactory instance;

    /**
     * Private constructor, to avoid more than one instance.
     */
    private BombedMazeFactory() {
    }

    @Override
    public Wall createWall() {
        return new BombedWall();
    }

    @Override
    public Room createRoom(int roomNo) {
        return new RoomWithABomb(roomNo);
    }

    @Override
    public Door createDoor(Room room1, Room room2) {
        return new ExplosiveDoor(room1, room2);
    }

    /**
     * Returns the singleton instance of BombedMazeFactory.
     * 
     * @return BombedMazeFactory instance.
     */
    public static BombedMazeFactory getInstance() {
        if(instance == null) {
            instance = new BombedMazeFactory();
        }

        return instance;
    }
}
