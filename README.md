# Design Patterns
This repository contains all design patterns from the book "Design Patterns: Elements of Reusable Object-Oriented Software". This book is one of the most popular books when it comes to design patterns. It was written by Gangs of Four (GoF), the nickname for the four authors: Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides. All examples in this repository are implemented in Java 17.

## Repository structure
The design patterns examples are organized by category. Inside directory `src/main/java/com/github/nicolasholanda/` there are three folders:
* `creational`: Contains patterns that provide object creation mechanisms, which increase flexibility and reuse of existing code.
* `structural`: Set of patterns that explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.
* `behavioral`: Patterns concerned with algorithms and the assignment of resposibilities between objects.

Each category folder has a `model` package containing all classes related to the issue that the design patterns are fixing. Other than that, each category folder has one directory for each pattern, with all classes related to it and a informative `README.md` file explaining how it works. Also, it is important to notice that every example has a class with a `main` method with a demo code.

## How to execute
1. Ensure you have `java 17` or above and maven
2. Run `maven clean package`
3. Find the class with the `main` method inside the folder of the design pattern you want to run
4. Open root folder of project and run the following command. **Replace the class name and package with the one you want to run.**
`java -cp target/classes 'com.github.nicolasholanda.creational.singleton.MazeGame'` 

## The Catalog of Design Patterns
Above, see the list of design patterns and, for each one, a checkbox indicating if it is already implemented in this repository:

### Creational Patterns
- [x] Abstract Factory
- [x] Factory Method
- [x] Builder
- [x] Prototype
- [x] Singleton

### Structural Patterns
- [x] Adapter
- [x] Bridge
- [x] Composite
- [x] Decorator
- [x] Facade
- [x] Flyweight
- [x] Proxy

### Behavioral Patterns
- [x] Chain of Responsibility
- [x] Command
- [x] Interpreter
- [x] Iterator
- [x] Mediator
- [ ] Memento
- [ ] Observer
- [ ] State
- [ ] Strategy
- [ ] Template Method
- [ ] Visitor