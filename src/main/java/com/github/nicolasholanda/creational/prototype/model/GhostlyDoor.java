package com.github.nicolasholanda.creational.prototype.model;

import java.util.Random;

import com.github.nicolasholanda.creational.model.Door;
import com.github.nicolasholanda.creational.model.Room;

/**
 * Concrete implementation of a Door that requires a password to be passed through.
 * Represents a ghostly door in a haunted maze that can only be opened with a password.
 */
public class GhostlyDoor extends Door implements Prototype {

    // The password needed to open the door
    public int password;

    /**
     * Constructor to initialize a ghostly door with two rooms and a randomly generated password.
     * The door is initially closed.
     * 
     * @param room1 The first room of the door.
     * @param room2 The second room of the door.
     */
    public GhostlyDoor(Room room1, Room room2) {
        super(room1, room2);
        this.password = (new Random()).nextInt();
    }

    /**
     * Constructor to initialize a ghostly door based on another instance.
     * 
     * @param target Another GhostlyDoor to copy from.
     */
    private GhostlyDoor(GhostlyDoor target) {
        super(target.getRoom1(), target.getRoom2());
        this.password = target.password;
        if (target.isOpen()) this.open();
    }

    /**
     * Clones the current ghostly door instance.
     */
    @Override
    public Prototype clone() {
        return new GhostlyDoor(this);
    }

    /**
     * Enters
     */
    @Override
    public void enter() {
        if (isOpen()) {
            System.out.println("You have entered the ghostly door!");
        } else {
            System.out.println("The door requires the password: " + password + " to open.");
        }
    }

    @Override
    public void open() {
        System.out.println("A password must be provided!");
    }

    /**
     * Opens the door if the password is right.
     * 
     * @param password The passowrd to open the door.
     */
    public void open(int password) {
        if(password == this.password) {
            super.open();
        } else {
            System.out.println("Wrong password!");
        }
    }

}
