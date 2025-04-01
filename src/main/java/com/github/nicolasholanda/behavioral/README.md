# Behavioral Design Patterns

Behavioral design patterns focus on communication between objects, defining how they interact and distribute responsibilities efficiently.

## Patterns Summary

### 1. Chain of Responsibility
Passes requests along a chain of handlers until one processes it.
- **Example**: Logging system with different severity levels.

### 2. Command
Encapsulates a request as an object, allowing undo/redo operations.
- **Example**: Text editor actions (copy, paste, undo).

### 3. Interpreter
Defines a grammar and provides an interpreter to process sentences.
- **Example**: Evaluating mathematical expressions.

### 4. Iterator
Provides a way to access elements of a collection without exposing its implementation.
- **Example**: Iterating through a list of users.

### 5. Mediator
Centralizes communication between objects to reduce dependencies.
- **Example**: Chatroom where users send messages via a mediator.

### 6. Memento
Captures an object’s state to restore it later (undo functionality).
- **Example**: Save and restore game progress.

### 7. Observer
Allows multiple objects to be notified of state changes.
- **Example**: Stock price updates notifying investors.

### 8. State
Changes an object’s behavior when its internal state changes.
- **Example**: Traffic light system with different states.

### 9. Strategy
Defines a family of algorithms, allowing them to be interchangeable.
- **Example**: Payment system with different payment methods.

### 10. Template Method
Defines the structure of an algorithm but allows subclasses to implement parts of it.
- **Example**: Data processing framework with steps defined by subclasses.

### 11. Visitor
Allows adding new operations to a structure without modifying existing elements.
- **Example**: Exporting different document elements (text, images, tables).