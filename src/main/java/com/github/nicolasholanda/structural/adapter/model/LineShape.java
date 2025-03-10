package com.github.nicolasholanda.structural.adapter.model;

/**
 * Line object of a draw.
 */
public class LineShape implements Shape {

    /**
     * Draws a line in screen.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a line: -------------");
    }
}
