Prototype Pattern
- type of object to create is determined by a prototypical instance, which is cloned to produce a new instance
- used to get a unique instance of the same object over and over for each new request

- Clone / Cloneable
- avoids keyword "new"
- although copy, each instance is unique
- Costly construction not handled by client
- Builder Pattern is the opposite of Prototype Pattern
- Can still utilize constructor parameters
- Has shallow copy or deep copy
- Shallow copy just copies the immediate properties
- Deep copy will copy any of its object references as well

Pitfalls:
- Not always clear when to use
- Used with other patterns
- Registry
- More coding for deep copy

Pattern Comparison:
- Lighter weight construction
- Copy Construction or Clone
- Shallow or Deep
- Copy of itself