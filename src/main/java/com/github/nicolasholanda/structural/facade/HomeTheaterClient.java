package com.github.nicolasholanda.structural.facade;

/**
 * Client to demo the home theater facade.
 */
public class HomeTheaterClient {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.watchMovie("The Matrix");
    }
}
