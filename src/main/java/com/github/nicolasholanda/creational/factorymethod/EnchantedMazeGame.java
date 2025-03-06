package com.github.nicolasholanda.creational.factorymethod;

import com.github.nicolasholanda.creational.model.Door;
import com.github.nicolasholanda.creational.model.Room;
import com.github.nicolasholanda.creational.model.Wall;
import com.github.nicolasholanda.creational.model.enchanted.DoorNeedingSpell;
import com.github.nicolasholanda.creational.model.enchanted.EnchantedRoom;
import com.github.nicolasholanda.creational.model.enchanted.MagicWall;

/**
 * A specialized MazeGame that creates enchanted rooms and doors needing spells.
 */
public class EnchantedMazeGame extends MazeGame {

    @Override
    protected Room createRoom(int roomNo) {
        return new EnchantedRoom(roomNo);
    }

    @Override
    protected Door createDoor(Room room1, Room room2) {
        return new DoorNeedingSpell(room1, room2, "Expelliarmus");
    }

    @Override
    protected Wall createWall() {
        return new MagicWall();
    }

}
