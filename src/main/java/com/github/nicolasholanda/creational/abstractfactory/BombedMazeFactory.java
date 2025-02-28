package com.github.nicolasholanda.creational.abstractfactory;

import com.github.nicolasholanda.creational.model.Door;
import com.github.nicolasholanda.creational.model.Room;
import com.github.nicolasholanda.creational.model.Wall;
import com.github.nicolasholanda.creational.model.bombed.BombedWall;
import com.github.nicolasholanda.creational.model.bombed.ExplosiveDoor;
import com.github.nicolasholanda.creational.model.bombed.RoomWithABomb;

/**
 * Concrete Factory for creating bombed maze walls and doors.
 */
public class BombedMazeFactory implements MazeFactory {

    @Override
    public Door createDoor(Room room1, Room room2) {
        return new ExplosiveDoor(room1, room2);
    }

    @Override
    public Wall createWall() {
        return new BombedWall();
    }

    @Override
    public Room createRoom(int roomNumber) {
        return new RoomWithABomb(roomNumber);
    }
}
