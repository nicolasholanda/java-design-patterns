package com.github.nicolasholanda.structural.adapter.model;

import com.github.nicolasholanda.structural.adapter.thirdparty.TextView;

/**
 * A text element in a draw.
 * This class is an adapter for {@link TextView}
 */
public class TextShape implements Shape {

    // TextView instance (adaptee)
    private TextView textView;

    public TextShape() {
        this.textView = new TextView();
    }

    /**
     * Draws a text using special draw from third-party library.
     */
    @Override
    public void draw() {
        this.textView.doSpecialDraw();
    }
}
