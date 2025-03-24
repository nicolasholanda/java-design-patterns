package com.github.nicolasholanda.behavioral.mediator;

public class ChatClient {
    public static void main(String[] args) {
        ConcreteMediator chatRoom = new ConcreteMediator();

        ConcreteColleague user1 = new ConcreteColleague("Alice");
        ConcreteColleague user2 = new ConcreteColleague("Bob");
        ConcreteColleague user3 = new ConcreteColleague("Charlie");

        chatRoom.addColleague(user1);
        chatRoom.addColleague(user2);
        chatRoom.addColleague(user3);

        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hey, Alice!");
    }
}
