package com.github.nicolasholanda.creational.singleton;

import com.github.nicolasholanda.creational.model.Door;
import com.github.nicolasholanda.creational.model.Room;
import com.github.nicolasholanda.creational.model.Wall;
import com.github.nicolasholanda.creational.model.enchanted.DoorNeedingSpell;
import com.github.nicolasholanda.creational.model.enchanted.EnchantedRoom;
import com.github.nicolasholanda.creational.model.enchanted.MagicWall;

/**
 * A singleton factory to produce enchanted maze objects.
 */
public class EnchantedMazeFactory implements MazeFactory {

    // Singleton instance
    private static EnchantedMazeFactory instance;

    /**
     * Private constructor, to avoid more than one instance.
     */
    private EnchantedMazeFactory() {
    }

    @Override
    public Wall createWall() {
        return new MagicWall();
    }

    @Override
    public Room createRoom(int roomNo) {
        return new EnchantedRoom(roomNo);
    }

    @Override
    public Door createDoor(Room room1, Room room2) {
        return new DoorNeedingSpell(room1, room2, "Alakazam");
    }

    /**
     * Returns the singleton instance of EnchantedMazeFactory.
     * 
     * @return EnchantedMazeFactory instance.
     */
    public static EnchantedMazeFactory getInstance() {
        if (instance == null) {
            instance = new EnchantedMazeFactory();
        }
        return instance;
    }
}
