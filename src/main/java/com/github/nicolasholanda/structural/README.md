# Structural Design Patterns

Structural design patterns focus on organizing classes and objects to ensure flexibility and efficient composition.

## Patterns Summary

### 1. Adapter  
Allows incompatible interfaces to work together by acting as a bridge.  
- **Example**: Connecting an old legacy system to a new API.

### 2. Bridge  
Decouples an abstraction from its implementation, allowing them to evolve independently.  
- **Example**: Different device types (TV, Radio) controlled by various remote implementations.

### 3. Composite  
Treats individual objects and compositions of objects uniformly.  
- **Example**: File system where files and folders are managed the same way.

### 4. Decorator  
Adds functionality to an object dynamically without modifying its structure.  
- **Example**: Adding scrollbars or borders to a UI component.

### 5. Facade  
Provides a simplified interface to a complex system.  
- **Example**: A single interface for a complex multimedia library.

### 6. Flyweight  
Optimizes memory by sharing common object states instead of creating duplicate instances.  
- **Example**: Large-scale text rendering where characters share common font data.

### 7. Proxy  
Acts as a surrogate to control access to another object.  
- **Example**: Virtual proxy loading images only when needed.