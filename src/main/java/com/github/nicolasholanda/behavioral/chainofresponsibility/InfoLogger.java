package com.github.nicolasholanda.behavioral.chainofresponsibility;

/**
 * Logger for handling info messages.
 */
class InfoLogger extends Logger {
    @Override
    protected boolean handleRequest(String message, String level) {
        if ("INFO".equalsIgnoreCase(level)) {
            System.out.println("[INFO]: " + message);
            return true;
        }
        return false;
    }
}