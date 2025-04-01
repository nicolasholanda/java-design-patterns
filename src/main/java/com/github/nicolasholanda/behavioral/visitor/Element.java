package com.github.nicolasholanda.behavioral.visitor;

/**
 * The Element interface declares an accept method that takes a Visitor.
 */
public interface Element {
    /**
     * Accepts a visitor, allowing it to perform operations on the element.
     * 
     * @param visitor The visitor performing the operation.
     */
    void accept(Visitor visitor);
}
