package com.github.nicolasholanda.structural.bridge;

/**
 * Concrete Implementor for headphones.
 * Implements the AudioDevice interface for headphone devices.
 */
public class Headphones implements AudioDevice {

    @Override
    public void playAudio(String audioContent) {
        System.out.println("Playing through headphones: " + audioContent);
    }

}
