package com.github.nicolasholanda.creational.prototype.model;

import com.github.nicolasholanda.creational.model.Room;

/**
 * Concrete implementation of room. This room may contain ghosts inside of it.
 */
public class HauntedRoom extends Room implements Prototype {

    // Number of ghosts inside this room.
    int numberOfGhosts = 0;

    /**
     * Constructor to create a haunted room based on number of ghosts.
     * 
     * @param roomNo Number that identifies this room
     * @param numberOfGhosts Number of ghosts inside the room
     */
    public HauntedRoom(int roomNo, int numberOfGhosts) {
        super(roomNo);
        this.numberOfGhosts = numberOfGhosts;
    }

    /**
     * Constructor to create a haunted room based on another instance.
     * 
     * @param target The haunted room to copy fields from.
     */
    private HauntedRoom(HauntedRoom target) {
        super(target.getRoomNumber());
        this.numberOfGhosts = target.numberOfGhosts;
    }

    /**
     * Attempts to enter the room. User can only enter if there are no ghosts there.
     */
    @Override
    public void enter() {
        if(numberOfGhosts > 0) {
            System.out.println("You can't enter this room. There are ghosts.");
        } else {
            System.out.println("You have entered the room.");
        }
    }

    /**
     * Removes one ghost from the room.
     */
    public void removeOneGhost() {
        if(numberOfGhosts > 0) {
            numberOfGhosts--;
            System.out.println("You removed one ghost. Remaining: " + numberOfGhosts);
        } else {
            System.out.println("There are no ghosts to remove.");
        }
    }

    /**
     * Clones the current instance of haunted room.
     */
    @Override
    public Prototype clone() {
        return new HauntedRoom(this);
    }
}
