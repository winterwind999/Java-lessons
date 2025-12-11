Factory Method Pattern
- opposite of Singleton pattern
- second most used Creational pattern

Concepts:
- Doesn't expose instantiation logic
- Defer to subclass
- Common interface
- Specified by architecture, implemented by user

Examples:
- Calendar
- ResourceBundle
- NumberFormat

Design:
- Responsible for lifecycle
- Common interface
- Concrete Class
- Parameterized create method

Pitfalls:
- Complexity
- Creation in subclass
- Difficult to refactor

Pattern Comparison:
- Returns various instances
- Multiple constructors
- Interface driven
- Subclasses
- Adaptable to environment more easily
- Parameter Driven
- Solves complex creation