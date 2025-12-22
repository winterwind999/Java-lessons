Iterator Pattern
- pattern for providing navigation without exposing the structure of an object

Concepts:
- Traverse a container
- Doesn't expose underlying structure
- Decouples algorithms
- Sequential in nature

Design:
- Interface based
- Factory Method based
- Independent, but fail fast
- Enumerators are fail-safe
- Iterator, ConcreteIterator

Pitfalls:
- No access to index
- Directional
- Can be slower/inefficient

Comparison to for loop:
- Interface based
- Algorithm is removed
- No index
- Concurrent modification

Summary:
- Efficient way to traverse
- Hides algorithm
- Simplify client
- foreach