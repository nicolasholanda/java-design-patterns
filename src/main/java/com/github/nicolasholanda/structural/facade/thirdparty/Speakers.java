package com.github.nicolasholanda.structural.facade.thirdparty;

/**
 * Speakers to play movie sound.
 */
public class Speakers extends Device {

    /**
     * Change spekaer volume.
     * 
     * @param level new volume level.
     */
    public void setVolume(int level) {
        if(isOn()) {
            System.out.println("Speaker volume is now: " + level);
            return;
        }
        
        System.out.println("Can't change volume. Speaker is off.");
    }
}
