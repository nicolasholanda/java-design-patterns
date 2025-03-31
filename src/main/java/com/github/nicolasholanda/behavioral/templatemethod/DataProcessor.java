package com.github.nicolasholanda.behavioral.templatemethod;

/**
 * Abstract class defining the template method for data processing.
 * It enforces a fixed structure while allowing subclasses to provide specific implementations.
 */
public abstract class DataProcessor {

    /**
     * Template method defining the overall data processing flow.
     * It ensures the execution order remains unchanged.
     */
    public final void process() {
        readData();
        processData();
        generateReport();
    }

    /**
     * Reads data from a specific source (to be implemented by subclasses).
     */
    protected abstract void readData();

    /**
     * Processes the data (default implementation, can be overridden).
     */
    protected void processData() {
        System.out.println("Processing data...");
    }

    /**
     * Generates a report based on the processed data.
     */
    protected void generateReport() {
        System.out.println("Generating report...");
    }
}

