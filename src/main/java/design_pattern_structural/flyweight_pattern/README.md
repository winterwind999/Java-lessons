Flyweight Pattern
- minimizes memory use by sharing data with similarly-typed objects

Concepts:
- Efficient memory usage
- Optimization pattern
- Large number of similar objects
- Specially the case for objects that are stateless or immutable
- Extrinsic object state

Examples:
- java.lang.String
- java.lang.Integer#valueOf(int)
- Boolean, Byte, Character, Short, Long

Design:
- Pattern of patterns
- Utilizes a Factory
- Encompasses Creation and Structure
- Client, Factory, Flyweight, and ConcreteFlyweight

Pitfalls:
- Complex pattern
- Premature optimization
- Must understand Factory pattern
- Not a graphical pattern

Comparison with Facade Pattern:
- Focus on memory optimization
- Optimization pattern
- Immutable Objects

Summary:
- Good to implement for systems like Inventory Management System, ecommerce, etc.
- Great for memory management
- A little bit complex
- Used frequently by core API