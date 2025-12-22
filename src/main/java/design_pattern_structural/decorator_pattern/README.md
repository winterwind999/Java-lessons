Decorator Pattern
- hierarchical type pattern that builds functionality at each level while using composition from similar data types

Concepts:
- Wrap another object to add functionality to it
- Add behavior without affecting others
- More than just inheritance
- Single Responsibility Principle
- Compose behavior dynamically

Design:
- Inheritance based
- Utilizes composition and inheritance (is-a, has-a)
- Alternative to subclassing
- Constructor requires instance from hierarchy

Pitfalls:
- New class for every feature added
- Multiple little objects
- Often confused with simple inheritance

Comparison with Composite Pattern:
- Contains another entity
- Modifies behavior (adds)
- Doesn't change underlying object