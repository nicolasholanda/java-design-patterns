package com.github.nicolasholanda.structural.composite;

/**
 * Represents a triangle object in a drawing.
 */
public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.print("/\\");
    }
}
