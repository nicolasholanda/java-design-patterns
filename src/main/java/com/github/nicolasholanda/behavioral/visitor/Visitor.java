package com.github.nicolasholanda.behavioral.visitor;

/**
 * Visitor interface that defines operations for different element types.
 */
public interface Visitor {
    /**
     * Visits a Text element.
     * 
     * @param text The Text element.
     */
    void visit(Text text);

    /**
     * Visits an Image element.
     * 
     * @param image The Image element.
     */
    void visit(Image image);

    /**
     * Visits a Table element.
     * 
     * @param table The Table element.
     */
    void visit(Table table);
}
