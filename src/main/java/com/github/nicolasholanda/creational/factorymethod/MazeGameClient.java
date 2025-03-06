package com.github.nicolasholanda.creational.factorymethod;

import com.github.nicolasholanda.creational.model.Maze;

public class MazeGameClient {
    public static void main(String[] args) {
        MazeGame mazeGame;

        // This could come from a user input or config
        boolean enchanted = true;

        if (enchanted) {
            mazeGame = new EnchantedMazeGame();
        } else {
            mazeGame = new BombedMazeGame();
        }

        Maze maze = mazeGame.createMaze();

        // Printed message will vary according to the type of maze.
        maze.getRoom(1).enter();
    }
}
