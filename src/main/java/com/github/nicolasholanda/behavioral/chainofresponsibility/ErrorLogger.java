package com.github.nicolasholanda.behavioral.chainofresponsibility;

/**
 * Logger for handling error messages.
 */
class ErrorLogger extends Logger {
    @Override
    protected boolean handleRequest(String message, String level) {
        if ("ERROR".equalsIgnoreCase(level)) {
            System.out.println("[ERROR]: " + message);
            return true;
        }
        return false;
    }
}