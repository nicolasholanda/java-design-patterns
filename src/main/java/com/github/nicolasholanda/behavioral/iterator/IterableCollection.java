package com.github.nicolasholanda.behavioral.iterator;

/**
 * Interface for collections that support iteration.
 */
public interface IterableCollection<T> {
    /**
     * Creates and returns an iterator for the collection.
     * 
     * @return an iterator instance.
     */
    Iterator<T> createIterator();
}
