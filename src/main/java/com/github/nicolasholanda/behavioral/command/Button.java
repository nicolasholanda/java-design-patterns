package com.github.nicolasholanda.behavioral.command;

/**
 * Invoker class that triggers commands.
 */
public class Button {
    private Command command;

    /**
     * Assigns a command to the button.
     * 
     * @param command the command to be executed when the button is clicked
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * Simulates a button click, executing the assigned command.
     */
    public void click() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command assigned to button.");
        }
    }
}