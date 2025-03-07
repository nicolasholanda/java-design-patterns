package com.github.nicolasholanda.creational.model.enchanted;

import com.github.nicolasholanda.creational.model.Door;
import com.github.nicolasholanda.creational.model.Room;

/**
 * Concrete implementation of a Door that requires a spell to be passed through.
 * Represents a magical door in the maze that can only be opened with a spell.
 */
public class DoorNeedingSpell extends Door {

    // The spell needed to open the door
    private String spellRequired;

    /**
     * Constructor to initialize a magical door with two rooms and the required spell.
     * The door is initially closed.
     * 
     * @param room1 The first room of the door.
     * @param room2 The second room of the door.
     * @param spellRequired The spell required to open the door.
     */
    public DoorNeedingSpell(Room room1, Room room2, String spellRequired) {
        super(room1, room2);  // Call the constructor of the parent class (Door)
        this.spellRequired = spellRequired;
    }

    /**
     * Gets the spell required to open the door.
     * 
     * @return The spell.
     */
    public String getSpellRequired() {
        return spellRequired;
    }

    /**
     * Sets the spell required to open the door.
     * 
     * @param spellRequired The new spell.
     */
    public void setSpellRequired(String spellRequired) {
        this.spellRequired = spellRequired;
    }

    /**
     * Overridden method to simulate the action of passing through a magical door.
     * Displays a message indicating the door requires a spell to be opened.
     */
    @Override
    public void enter() {
        if (isOpen()) {
            System.out.println("You have entered the magical door!");
        } else {
            System.out.println("The door requires the spell: " + spellRequired + " to open.");
        }
    }

    @Override
    public void open() {
        if(isOpen()) {
            System.out.println("This door is already open.");
        } else {
            System.out.println("You must provide a spell to open this door!");
        }
    }

    public void open(String spell) {
        if(isOpen()) {
            System.out.println("This door is already open!");
            return;
        }

        if(this.spellRequired.equals(spell)) {
            super.open();
        } else {
            System.out.println("Wrong spell!");
        }
    }
}
