package com.github.nicolasholanda.creational.prototype.model;

/**
 * Prototype interface that defines the cloning method.
 */
public interface Prototype {

    /**
     * Clones the current object.
     * @return a new cloned instance
     */
    Prototype clone();
}
