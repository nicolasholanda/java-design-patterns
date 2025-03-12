package com.github.nicolasholanda.structural.composite;

/**
 * Represents a line in a drawing.
 */
public class Line implements Shape {

    @Override
    public void draw() {
        System.out.print("-");
    }
}
