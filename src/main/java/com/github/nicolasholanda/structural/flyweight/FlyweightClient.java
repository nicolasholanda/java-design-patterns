package com.github.nicolasholanda.structural.flyweight;

/**
 * Client class that utilizes the Flyweight pattern.
 */
public class FlyweightClient {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        String text = "HEY, HELLO FLYWEIGHT";
        String font = "Arial";
        int size = 12;

        for (char c : text.toCharArray()) {
            if (c != ' ') {
                CharacterFlyweight flyweight = factory.getCharacter(c);
                flyweight.render(font, size);
            }
        }

        System.out.println("Total flyweight objects created: " + factory.getFlyweightCount());
        System.out.println("Size of text: " + text.length());
    }

}
