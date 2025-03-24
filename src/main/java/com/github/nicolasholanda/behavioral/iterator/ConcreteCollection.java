package com.github.nicolasholanda.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of a collection that supports iteration.
 */
public class ConcreteCollection<T> implements IterableCollection<T> {
    private final List<T> items = new ArrayList<>();

    /**
     * Adds an element to the collection.
     * 
     * @param item The element to be added.
     */
    public void addItem(T item) {
        items.add(item);
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items);
    }
}
