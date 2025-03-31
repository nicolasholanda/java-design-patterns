package com.github.nicolasholanda.behavioral.templatemethod;

/**
 * Concrete implementation of DataProcessor for processing JSON data.
 */
public class JsonDataProcessor extends DataProcessor {

    /**
     * Reads data from a JSON file.
     */
    @Override
    protected void readData() {
        System.out.println("Reading data from JSON file...");
    }
}

