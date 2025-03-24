package com.github.nicolasholanda.behavioral.iterator;

/**
 * Iterator interface defining methods for traversing a collection.
 */
public interface Iterator<T> {
    /**
     * Checks if there are more elements in the collection.
     * 
     * @return true if there is a next element, false otherwise.
     */
    boolean hasNext();

    /**
     * Returns the next element in the collection.
     * 
     * @return the next element.
     */
    T next();
}
