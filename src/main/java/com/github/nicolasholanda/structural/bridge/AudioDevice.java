package com.github.nicolasholanda.structural.bridge;

/**
 * The Implementor interface for audio devices.
 * Defines the operations that all concrete audio devices must implement.
 */
interface AudioDevice {

    /**
     * Plays audio content through the device.
     * 
     * @param audioContent The content to be played
     */
    void playAudio(String audioContent);
}
