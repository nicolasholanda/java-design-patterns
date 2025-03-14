package com.github.nicolasholanda.structural.facade.thirdparty;

/**
 * Shows movies on a big screen.
 */
public class Projector extends Device {

    /**
     * Shows in screen a movie from a input player.
     * 
     * @param player the player which will play the movie.
     */
    public void setInput(DVDPlayer player) {
        if(isOn()) {
            System.out.println("Input set to DVD player.");
            return;
        }
        
        System.out.println("Can't change input. Projector is off.");
    }
}
