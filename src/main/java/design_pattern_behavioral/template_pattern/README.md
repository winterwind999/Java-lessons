Template Pattern
- used to defined an algorithm that allows subclasses to redefine parts of the algorithm without changing its structure

Concepts:
- Code reuse
- Common in libraries/frameworks
- IoC frameworks
- Algorithm emphasis

Examples:
- java.util.Collections#sort()

Design:
- Abstract base class
- Base calls Child
- Hooks
- Operations
- AbstractBase, Concrete Class

Pitfalls:
- Restrict access
- Confusing hierarchy
- Difficult Program flow

Comparison with Strategy Pattern:
- Same algorithm
- Class based
- Compile time