package com.github.nicolasholanda.structural.adapter;

import com.github.nicolasholanda.structural.adapter.model.LineShape;
import com.github.nicolasholanda.structural.adapter.model.Shape;
import com.github.nicolasholanda.structural.adapter.model.TextShape;

/**
 * Simulates a drawing editor application.
 */
public class DrawingEditor {

    public static void main(String[] args) {
        System.out.println("Creating a draw...");
        
        Shape line = new LineShape();
        line.draw();

        Shape text = new TextShape();
        text.draw();
    }
}
