package com.github.nicolasholanda.creational.factorymethod;

import com.github.nicolasholanda.creational.model.Door;
import com.github.nicolasholanda.creational.model.Room;
import com.github.nicolasholanda.creational.model.Wall;
import com.github.nicolasholanda.creational.model.bombed.BombedWall;
import com.github.nicolasholanda.creational.model.bombed.ExplosiveDoor;
import com.github.nicolasholanda.creational.model.bombed.RoomWithABomb;

/**
 * A specialized MazeGame that creates bombed rooms and explosive doors.
 */
public class BombedMazeGame extends MazeGame {

    @Override
    protected Door createDoor(Room room1, Room room2) {
        return new ExplosiveDoor(room1, room2);
    }

    @Override
    protected Room createRoom(int roomNo) {
        return new RoomWithABomb(roomNo);
    }

    @Override
    protected Wall createWall() {
        return new BombedWall();
    }

}
