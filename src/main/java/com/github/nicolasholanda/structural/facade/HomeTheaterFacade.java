package com.github.nicolasholanda.structural.facade;

import com.github.nicolasholanda.structural.facade.thirdparty.DVDPlayer;
import com.github.nicolasholanda.structural.facade.thirdparty.Light;
import com.github.nicolasholanda.structural.facade.thirdparty.Projector;
import com.github.nicolasholanda.structural.facade.thirdparty.Speakers;

/**
 * Facade to provide a watchMovie operation for clients.
 */
public class HomeTheaterFacade {

    /**
     * Sets up the home theater environment and plays a movie.
     * 
     * @param movie the movie to watch.
     */
    public void watchMovie(String movie) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Light light = new Light();
        Speakers speakers = new Speakers();
        Projector projector = new Projector();

        light.turnOn();
        light.setDim(20);

        speakers.turnOn();
        speakers.setVolume(50);

        dvdPlayer.turnOn();

        projector.turnOn();
        projector.setInput(dvdPlayer);

        dvdPlayer.playMovie(movie);
    }
}
