package com.github.nicolasholanda.structural.proxy;

/**
 * The real image that performs loading and displaying.
 */
public class RealImage implements Image {
    private String filename;

    /**
     * Constructs a RealImage and loads it from disk.
     *
     * @param filename The name of the image file.
     */
    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    /**
     * Simulates loading the image from disk.
     */
    private void loadImageFromDisk() {
        System.out.println("Loading image: " + filename);
    }

    /**
     * Displays the image.
     */
    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}