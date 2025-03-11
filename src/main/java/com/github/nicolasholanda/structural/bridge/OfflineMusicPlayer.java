package com.github.nicolasholanda.structural.bridge;

/**
 * A Refined Abstraction that represents an offline music player.
 * Implements the MusicPlayer interface for local music files.
 */
class OfflineMusicPlayer extends MusicPlayer {

    public OfflineMusicPlayer(AudioDevice audioDevice) {
        super(audioDevice);
    }

    @Override
    void play(String song) {
        System.out.println("Loading song " + song + " from storage...");
        this.audioDevice.playAudio(song);
    }

}
