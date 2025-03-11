package com.github.nicolasholanda.structural.bridge;

/**
 * A Refined Abstraction that represents a streaming music player.
 * Implements the MusicPlayer interface for streaming music services.
 */
class StreamingMusicPlayer extends MusicPlayer {

    public StreamingMusicPlayer(AudioDevice audioDevice) {
        super(audioDevice);
    }

    @Override
    void play(String song) {
        System.out.println("Streaming song " + song);
        this.audioDevice.playAudio(song);
    }

}
