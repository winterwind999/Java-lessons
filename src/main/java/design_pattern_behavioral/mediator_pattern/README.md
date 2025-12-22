Mediator Pattern
- define how objects interact with one another without having to refer each one explicitly

Concepts:
- Loose coupling
- Well-defined but complex
- Reusable components
- acts as Hub/Router

Examples:
- java.util.Timer

Design:
- Interface based
- Concrete class
- Minimizes inheritance
- Mediator knows about colleagues rather than colleagues knowing about each other
- Mediator, ConcreteMediator

Pitfalls:
- Deity object or everything to everybody
- It doesn't limit subclassing
- Over or with Command

Comparison to Observer Pattern:
- Defines interaction
- Object decoupling
- More specific

Summary:
- Loose coupling
- Simplified communication
- Mediator complexity
- Use with Command Pattern
- Can be implemented with an Observer in it as the notification mechanism