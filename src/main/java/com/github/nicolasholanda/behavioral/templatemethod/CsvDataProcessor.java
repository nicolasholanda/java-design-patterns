package com.github.nicolasholanda.behavioral.templatemethod;

/**
 * Concrete implementation of DataProcessor for processing CSV data.
 */
public class CsvDataProcessor extends DataProcessor {

    /**
     * Reads data from a CSV file.
     */
    @Override
    protected void readData() {
        System.out.println("Reading data from CSV file...");
    }
}

