package com.github.nicolasholanda.creational.model;

/**
 * Represents a component of a maze.
 */
public interface MapSite {

    /** 
     * Interacts with the current {@link MapSite} instance.
     * If the player is not allowed to enter, their nose will get hurt.
     * Otherwise, their location will be changed.
     */
    void enter();
}
