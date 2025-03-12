package com.github.nicolasholanda.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a picture in a drawing, containing multiple shape objects.
 */
public class Picture implements Shape {

    private List<Shape> shapes = new ArrayList<>();

    /**
     * Draws the picture by calling draw for each shape.
     */
    @Override
    public void draw() {
        for(Shape shape : shapes) {
            shape.draw();
        }
    }

    /**
     * Add a shape to the picture.
     * 
     * @param shape Shape to be added.
     */
    public void add(Shape shape) {
        this.shapes.add(shape);
    }

    /**
     * Removes a shape from the picture.
     * 
     * @param shape Shape to be removed.
     */
    public void remove(Shape shape) {
        this.shapes.remove(shape);
    }
}
