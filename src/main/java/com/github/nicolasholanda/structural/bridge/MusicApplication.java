package com.github.nicolasholanda.structural.bridge;

/**
 * Client class that demonstrates the Bridge pattern with different music players and audio devices.
 */
public class MusicApplication {
 
    public static void main(String[] args) {
        Speakers speakers = new Speakers();
        Headphones headphones = new Headphones();

        StreamingMusicPlayer spotifyPlayer = new StreamingMusicPlayer(speakers);
        spotifyPlayer.play("Bohemian Rhapsody - Queen");

        OfflineMusicPlayer localPlayer = new OfflineMusicPlayer(headphones);
        localPlayer.play("Hotel California - Eagles");
    }
}
