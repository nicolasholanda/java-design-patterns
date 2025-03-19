package com.github.nicolasholanda.behavioral.chainofresponsibility;

public class LoggerClient {
    public static void main(String[] args) {
        Logger errorLogger = new ErrorLogger();
        Logger warningLogger = new WarningLogger();
        Logger infoLogger = new InfoLogger();

        // Chain the loggers
        infoLogger.setNext(warningLogger);
        warningLogger.setNext(errorLogger);

        // Test logging at different levels
        infoLogger.log("This is an information message.", "INFO");
        infoLogger.log("This is a warning message.", "WARNING");
        infoLogger.log("This is an error message.", "ERROR");
    }
}