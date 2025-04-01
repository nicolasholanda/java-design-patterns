package com.github.nicolasholanda.behavioral.visitor;

/**
 * Represents a table element in the document.
 */
public class Table implements Element {
    private int rows;
    private int columns;

    /**
     * Constructs a Table element with the specified number of rows and columns.
     * 
     * @param rows    The number of rows.
     * @param columns The number of columns.
     */
    public Table(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    /**
     * Gets the number of rows in the table.
     * 
     * @return The number of rows.
     */
    public int getRows() {
        return rows;
    }

    /**
     * Gets the number of columns in the table.
     * 
     * @return The number of columns.
     */
    public int getColumns() {
        return columns;
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
