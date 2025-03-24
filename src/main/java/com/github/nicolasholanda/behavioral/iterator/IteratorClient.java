package com.github.nicolasholanda.behavioral.iterator;

public class IteratorClient {
    public static void main(String[] args) {
        ConcreteCollection<String> collection = new ConcreteCollection<>();
        collection.addItem("A");
        collection.addItem("B");
        collection.addItem("C");

        Iterator<String> iterator = collection.createIterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
