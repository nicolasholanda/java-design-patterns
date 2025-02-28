package com.github.nicolasholanda.creational.abstractfactory;

import com.github.nicolasholanda.creational.model.Direction;
import com.github.nicolasholanda.creational.model.Door;
import com.github.nicolasholanda.creational.model.MapSite;
import com.github.nicolasholanda.creational.model.Maze;
import com.github.nicolasholanda.creational.model.Room;

/**
 * MazeGame acts as the Client and uses the factories to create different types of mazes.
 */
public class MazeGame {

    /**
     * Creates a maze using the specified factory and demonstrates the creation of rooms, walls, and doors.
     * 
     * @param factory The MazeFactory implementation (Enchanted or Explosive).
     * @return Maze object containing the rooms
     */
    public Maze createMaze(MazeFactory factory) {
        // Create rooms using the factory
        Room room1 = factory.createRoom(1);
        Room room2 = factory.createRoom(2);

        // Create doors using the factory
        Door door = factory.createDoor(room1, room2);

        // Setup rooms sides
        room1.setSide(Direction.NORTH, factory.createWall());
        room1.setSide(Direction.EAST, door);
        room1.setSide(Direction.SOUTH, factory.createWall());
        room1.setSide(Direction.WEST, factory.createWall());
        
        room2.setSide(Direction.WEST, door);
        room2.setSide(Direction.NORTH, factory.createWall());
        room2.setSide(Direction.SOUTH, factory.createWall());
        room2.setSide(Direction.EAST, factory.createWall());

        // Creates and returns the new maze containing the rooms
        Maze maze = new Maze();
        maze.addRoom(room1);
        maze.addRoom(room2);

        return maze;
    }

    public static void main(String[] args) {
        Maze maze;
        MazeGame game = new MazeGame();

        // Using the EnchantedMazeFactory to create an enchanted maze
        System.out.println("Creating an enchanted maze...");
        MazeFactory enchantedFactory = new EnchantedMazeFactory();
        maze = game.createMaze(enchantedFactory);

        Room room1 = maze.getRoom(1);
        room1.enter();
        
        MapSite side = room1.getSide(Direction.NORTH);
        side.enter();
        
        side = room1.getSide(Direction.EAST);
        side.enter();


        System.out.println("Creating an explosive maze...");
        MazeFactory explosiveFactory = new BombedMazeFactory();
        maze = game.createMaze(explosiveFactory);

        Room room2 = maze.getRoom(2);
        room2.enter();
        
        side = room2.getSide(Direction.NORTH);
        side.enter();
        
        side = room2.getSide(Direction.WEST);
        side.enter();
    }

}
