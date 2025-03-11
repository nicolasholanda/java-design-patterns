package com.github.nicolasholanda.structural.bridge;

/**
 * Concrete Implementor for speakers.
 * Implements the AudioDevice interface for speaker systems.
 */
public class Speakers implements AudioDevice {

    @Override
    public void playAudio(String audioContent) {
        System.out.println("Playing through speakers: " + audioContent);
    }

}
