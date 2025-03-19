package com.github.nicolasholanda.behavioral.chainofresponsibility;

/**
 * Logger for handling warning messages.
 */
class WarningLogger extends Logger {
    @Override
    protected boolean handleRequest(String message, String level) {
        if ("WARNING".equalsIgnoreCase(level)) {
            System.out.println("[WARNING]: " + message);
            return true;
        }
        return false;
    }
}