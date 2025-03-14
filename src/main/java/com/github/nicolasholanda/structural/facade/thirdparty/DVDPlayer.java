package com.github.nicolasholanda.structural.facade.thirdparty;

/**
 * Reads DVD movies.
 */
public class DVDPlayer extends Device {

    /**
     * Plays a DVD movie.
     * 
     * @param movie the movie to play
     */
    public void playMovie(String movie) {
        if(isOn()) {
            System.out.println("Playing: " + movie);
            return;
        }

        System.out.println("DVD player can't play movie, it is off.");
    }
}
