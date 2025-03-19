package com.github.nicolasholanda.behavioral.chainofresponsibility;

/**
 * Abstract logger that defines the structure for handling log messages.
 */
abstract class Logger {
    protected Logger nextLogger;

    /**
     * Sets the next logger in the chain.
     *
     * @param nextLogger The next logger to handle the request.
     */
    public void setNext(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    /**
     * Handles the logging request.
     *
     * @param message The log message.
     * @param level   The severity level of the log.
     */
    public void log(String message, String level) {
        if (handleRequest(message, level)) {
            return;
        }
        if (nextLogger != null) {
            nextLogger.log(message, level);
        }
    }

    /**
     * Abstract method to be implemented by concrete loggers.
     *
     * @param message The log message.
     * @param level   The severity level of the log.
     * @return True if the request was handled, otherwise false.
     */
    protected abstract boolean handleRequest(String message, String level);
}
