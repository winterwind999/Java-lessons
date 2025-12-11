Builder Pattern
- a pattern for handling the construction of objects that may contain a lot of parameters 
- we want to make the object immutable once we're done constructing it.

Pitfalls:
- Immutable
- Static inner class
- Designed first
- Complexity

Pattern Comparison:
- Handles complex constructors
- No interface required
- Can be a separate class but typically implemented in the class it is built in
- Works with legacy cody