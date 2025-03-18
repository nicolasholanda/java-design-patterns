package com.github.nicolasholanda.structural.proxy;

/**
 * Proxy class that controls access to the {@link RealImage} object.
 */
public class ImageProxy implements Image {
    
    private RealImage realImage;
    private String filename;

    /**
     * Constructs an ImageProxy with a filename.
     *
     * @param filename The name of the image file.
     */
    public ImageProxy(String filename) {
        this.filename = filename;
    }

    /**
     * Displays the image, loading it lazily if necessary.
     */
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}