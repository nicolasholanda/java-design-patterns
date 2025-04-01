package com.github.nicolasholanda.behavioral.visitor;

/**
 * A visitor implementation that renders document elements.
 */
public class RenderVisitor implements Visitor {

    /**
     * Renders a Text element.
     * 
     * @param text The Text element.
     */
    @Override
    public void visit(Text text) {
        System.out.println("Rendering text: " + text.getContent());
    }

    /**
     * Renders an Image element.
     * 
     * @param image The Image element.
     */
    @Override
    public void visit(Image image) {
        System.out.println("Rendering image from: " + image.getFilePath());
    }

    /**
     * Renders a Table element.
     * 
     * @param table The Table element.
     */
    @Override
    public void visit(Table table) {
        System.out.println("Rendering table with " + table.getRows() + " rows and " + table.getColumns() + " columns.");
    }
}
