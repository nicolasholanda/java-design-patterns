package com.github.nicolasholanda.creational.singleton;

public class MazeGame {

    public static void main(String[] args) {
        // Not possible to run this statement, since the constructor is private
        // EnchantedMazeFactory enchantedMazeFactory = new EnchantedMazeFactory();
        
        EnchantedMazeFactory enchantedMazeFactory = EnchantedMazeFactory.getInstance();
        enchantedMazeFactory.createRoom(1).enter();

        // The instance is always the same
        assert enchantedMazeFactory == EnchantedMazeFactory.getInstance();

        BombedMazeFactory bombedMazeFactory = BombedMazeFactory.getInstance();
        bombedMazeFactory.createRoom(2).enter();

        // The instance is always the same
        assert bombedMazeFactory == BombedMazeFactory.getInstance();
    }
}
