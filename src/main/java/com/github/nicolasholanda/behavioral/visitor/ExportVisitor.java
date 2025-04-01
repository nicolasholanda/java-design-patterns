package com.github.nicolasholanda.behavioral.visitor;

/**
 * A visitor implementation that exports document elements.
 */
public class ExportVisitor implements Visitor {

    /**
     * Exports a Text element.
     * 
     * @param text The Text element.
     */
    @Override
    public void visit(Text text) {
        System.out.println("Exporting text: " + text.getContent());
    }

    /**
     * Exports an Image element.
     * 
     * @param image The Image element.
     */
    @Override
    public void visit(Image image) {
        System.out.println("Exporting image from: " + image.getFilePath());
    }

    /**
     * Exports a Table element.
     * 
     * @param table The Table element.
     */
    @Override
    public void visit(Table table) {
        System.out.println("Exporting table with " + table.getRows() + " rows and " + table.getColumns() + " columns.");
    }
}
