package com.github.nicolasholanda.structural.bridge;

/**
 * The Abstraction that defines the interface for controlling music playback.
 * Contains a reference to an AudioDevice implementation.
 */
public abstract class MusicPlayer {

    protected AudioDevice audioDevice;

    /**
     * Constructor that accepts an AudioDevice implementation.
     * 
     * @param audioDevice The audio device to use for playback
     */
    protected MusicPlayer(AudioDevice audioDevice) {
        this.audioDevice = audioDevice;
    }

    /**
     * Plays a song on the current audio device.
     * 
     * @param song The song to play
     */
    abstract void play(String song);

}
