package com.github.nicolasholanda.creational.builder;

import com.github.nicolasholanda.creational.model.Maze;

/**
 * The MazeGame class is responsible for constructing a maze using a given builder.
 * It uses the builder to construct the maze step by step and ensures the
 * correct order of operations.
 */
public class MazeGame {

    /**
     * Constructs a maze using the specified builder.
     * The method delegates the task of building rooms, doors, and the maze structure to the builder.
     * 
     * @param builder The builder that will be used to construct the maze.
     * @return The constructed maze.
     */
    public Maze createMaze(MazeBuilder builder) {
        builder.buildMaze();
        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildDoor(1, 2);
        return builder.getMaze();
    }


    public static void main(String[] args) {
        // Constructing a maze using StandardMazeBuilder
        MazeGame mazeGame = new MazeGame();
        StandardMazeBuilder standardMazeBuilder = new StandardMazeBuilder();
        Maze maze = mazeGame.createMaze(standardMazeBuilder);
        System.out.println("Maze constructed with Standard Maze Builder: " + maze);

        // Constructing a maze using CountingMazeBuilder
        CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();
        maze = mazeGame.createMaze(countingMazeBuilder);
        System.out.println("Maze constructed with Counting Maze Builder: " + maze);
    }
}
