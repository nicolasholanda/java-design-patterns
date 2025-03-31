package com.github.nicolasholanda.behavioral.templatemethod;

public class DataProcessorClient {
    public static void main(String[] args) {
        // Using CSV processor
        DataProcessor csvProcessor = new CsvDataProcessor();
        csvProcessor.process();

        System.out.println();

        // Using JSON processor
        DataProcessor jsonProcessor = new JsonDataProcessor();
        jsonProcessor.process();
    }
}

