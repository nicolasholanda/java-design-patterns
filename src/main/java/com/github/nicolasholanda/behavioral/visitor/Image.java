package com.github.nicolasholanda.behavioral.visitor;

/**
 * Represents an image element in the document.
 */
public class Image implements Element {
    private String filePath;

    /**
     * Constructs an Image element with the given file path.
     * 
     * @param filePath The file path of the image.
     */
    public Image(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Gets the file path of the image.
     * 
     * @return The image file path.
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Accepts a visitor to process this element.
     * 
     * @param visitor The visitor performing operations on the element.
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
