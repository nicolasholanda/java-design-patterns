package com.github.nicolasholanda.structural.composite;

/**
 * Represents a square object in a drawing
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.print("■");
    }
}
