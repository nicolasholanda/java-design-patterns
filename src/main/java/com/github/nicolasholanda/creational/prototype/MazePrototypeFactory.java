package com.github.nicolasholanda.creational.prototype;

import com.github.nicolasholanda.creational.prototype.model.CursedWall;
import com.github.nicolasholanda.creational.prototype.model.GhostlyDoor;
import com.github.nicolasholanda.creational.prototype.model.HauntedRoom;
import com.github.nicolasholanda.creational.prototype.model.Prototype;

/**
 * Factory that creates maze components using prototypes.
 */
public class MazePrototypeFactory {

    private HauntedRoom prototypeRoom;
    private GhostlyDoor prototypeDoor;
    private CursedWall prototypeWall;

    public MazePrototypeFactory(HauntedRoom room, GhostlyDoor door, CursedWall wall) {
        this.prototypeRoom = room;
        this.prototypeDoor = door;
        this.prototypeWall = wall;
    }

    public Prototype makeRoom() {
        return prototypeRoom.clone();
    }

    public Prototype makeDoor() {
        return prototypeDoor.clone();
    }

    public Prototype makeWall() {
        return prototypeWall.clone();
    }
}
