package com.github.nicolasholanda.behavioral.iterator;

import java.util.List;

/**
 * Concrete implementation of the Iterator interface.
 * Iterates over a list of elements.
 */
public class ConcreteIterator<T> implements Iterator<T> {
    private final List<T> items;
    private int index = 0;

    /**
     * Constructor to initialize the iterator with a list.
     * 
     * @param items The list of items to iterate over.
     */
    public ConcreteIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return index < items.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements in the collection.");
        }
        return items.get(index++);
    }
}
