package com.github.nicolasholanda.structural.composite;

/**
 * Represents a drawing editor client code.
 */
public class DrawingEditor {

    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape square = new Square();
        Shape line = new Line();

        Picture picture = new Picture();
        picture.add(triangle);
        picture.add(line);
        picture.add(square);

        Picture picture2 = new Picture();
        
        picture2.add(new Line());
        picture2.add(picture);
        picture2.add(new Line());

        picture2.draw();
    }
}
