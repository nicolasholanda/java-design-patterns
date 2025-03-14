package com.github.nicolasholanda.structural.facade.thirdparty;

/**
 * Lights of a home theater.
 */
public class Light extends Device {

    /**
     * Dims the light.
     * 
     * @param level dim level of the light.
     */
    public void setDim(int level) {
        if(isOn()) {
            System.out.println("Light dim level is now: " + level);
            return;
        }
        
        System.out.println("Can't dim the light. It is off.");
    }
}
