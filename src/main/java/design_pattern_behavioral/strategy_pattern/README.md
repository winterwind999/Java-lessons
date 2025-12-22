Strategy Pattern
- used when you want to enable strategy or algorithm to be selected at runtime

Concepts:
- Eliminate conditional statements
- Behavior encapsulated in class
- Difficult to add new strategies
- Client aware of strategies
- Client chooses strategy

Design:
- Abstract base class
- Concrete class per strategy
- Removes if/else conditions
- Strategies are independent
- Context, Strategy, ConcreteStrategy

Pitfalls:
- Client must be aware of Strategies
- Increased number of classes

Comparison with State Pattern:
- More powerful than State Pattern
- Interface based
- Algorithms are independent
- Class per Algorithm