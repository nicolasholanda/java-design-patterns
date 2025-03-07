package com.github.nicolasholanda.creational.prototype;

import com.github.nicolasholanda.creational.model.Direction;
import com.github.nicolasholanda.creational.model.Maze;
import com.github.nicolasholanda.creational.prototype.model.CursedWall;
import com.github.nicolasholanda.creational.prototype.model.GhostlyDoor;
import com.github.nicolasholanda.creational.prototype.model.HauntedRoom;

public class MazeGame {
    public static Maze createMaze(MazePrototypeFactory factory) {
        HauntedRoom room1 = (HauntedRoom) factory.makeRoom();
        room1.setSide(Direction.EAST, (CursedWall) factory.makeWall());
        room1.setSide(Direction.WEST, (CursedWall) factory.makeWall());
        room1.setSide(Direction.SOUTH, (GhostlyDoor) factory.makeDoor());
        room1.setSide(Direction.NORTH, (CursedWall) factory.makeWall());

        HauntedRoom room2 = (HauntedRoom) factory.makeRoom();
        room1.setSide(Direction.EAST, (GhostlyDoor) factory.makeDoor());
        room1.setSide(Direction.WEST, (CursedWall) factory.makeWall());
        room1.setSide(Direction.SOUTH, (GhostlyDoor) factory.makeDoor());
        room1.setSide(Direction.NORTH, (CursedWall) factory.makeWall());

        Maze maze = new Maze();
        maze.addRoom(room1);
        maze.addRoom(room2);
        
        return maze;
    }

    public static void main(String[] args) {
        HauntedRoom hauntedRoom = new HauntedRoom(1, 2);
        HauntedRoom hauntedRoom2 = new HauntedRoom(2, 3);
        GhostlyDoor ghostlyDoor = new GhostlyDoor(hauntedRoom, hauntedRoom2);
        CursedWall cursedWall = new CursedWall(true);

        MazePrototypeFactory factory = new MazePrototypeFactory(hauntedRoom, ghostlyDoor, cursedWall);
        Maze maze = createMaze(factory);

        HauntedRoom room = (HauntedRoom) maze.getRoom(1);
        room.enter();

        room.removeOneGhost();
        room.removeOneGhost();

        room.enter();

        GhostlyDoor door = (GhostlyDoor) room.getSide(Direction.EAST);
        door.enter();
        door.open(door.password);
        door.enter();
    }
}
