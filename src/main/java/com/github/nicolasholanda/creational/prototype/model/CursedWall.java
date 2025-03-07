package com.github.nicolasholanda.creational.prototype.model;

import com.github.nicolasholanda.creational.model.Wall;

/**
 * Concrete implementation of Wall.
 * This one is cursed. Avoid touching them.
 */
public class CursedWall extends Wall implements Prototype {

    public boolean isCursed = true;

    /**
     * Constructor to instantiate a new CursedWall specifying if it is cursed.
     * 
     * @param isCursed Indicates if this wall is cursed.
     */
    public CursedWall(boolean isCursed) {
        this.isCursed = isCursed;
    }

    /**
     * Constructor that clones a CursedWall instance.
     * 
     * @param target The cursed wall to be cloned.
     */
    private CursedWall(CursedWall target) {
        super();
        this.isCursed = target.isCursed;
    }

    /**
     * Attempts to "enter" the wall. However, if it is cursed, the player will be cursed.
     */
    @Override
    public void enter() {
        if(isCursed) {
            System.out.println("You stumbled on a cursed wall. Now you are cursed!");
        } else {
            System.out.println("Lucky you! This wall is not cursed anymore.");
        }
    }

    /**
     * Removes the curse from a wall.
     */
    public void removeCurse() {
        this.isCursed = false;
        System.out.println("You have removed the curse from this wall.");
    }

    /**
     * Clones the current cursed wall instance.
     */
    @Override
    public Prototype clone() {
        return new CursedWall(this);
    }
}
