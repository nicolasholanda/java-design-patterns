package com.github.nicolasholanda.structural.facade.thirdparty;

/**
 * Abstract class common for all home theater devices.
 */
public abstract class Device {
    private boolean on = false;

    /**
     * Turns the device on.
     */
    public void turnOn() {
        this.on = true;
    }

    /**
     * Turns the device off.
     */
    public void turnOff() {
        this.on = false;
    }

    /**
     * Indicates if device is on.
     * 
     * @return true if device is on.
     */
    public boolean isOn() {
        return this.on;
    }
}
