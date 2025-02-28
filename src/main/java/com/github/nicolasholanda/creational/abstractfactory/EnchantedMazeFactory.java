package com.github.nicolasholanda.creational.abstractfactory;

import com.github.nicolasholanda.creational.model.Door;
import com.github.nicolasholanda.creational.model.Room;
import com.github.nicolasholanda.creational.model.Wall;
import com.github.nicolasholanda.creational.model.enchanted.DoorNeedingSpell;
import com.github.nicolasholanda.creational.model.enchanted.EnchantedRoom;
import com.github.nicolasholanda.creational.model.enchanted.MagicWall;

/**
 * Concrete Factory for creating enchanted maze walls and doors.
 */
public class EnchantedMazeFactory implements MazeFactory {

    @Override
    public Door createDoor(Room room1, Room room2) {
        return new DoorNeedingSpell(room1, room2, "Abrakadabra");
    }

    @Override
    public Wall createWall() {
        return new MagicWall();
    }

    @Override
    public Room createRoom(int roomNo) {
        return new EnchantedRoom(roomNo);
    }
}
