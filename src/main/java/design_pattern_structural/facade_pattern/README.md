Facade Pattern
- simplified interface to a complex or difficult to use system that is often the result of a poorly designed API

Concepts:
- Easier API usage
- Reduce external dependencies
- Simplified interface
- Typically refactoring pattern

Examples:
- java.net.URL

Design:
- Class that utilizes composition
- Shouldn't need inheritance
- Typically, encompasses full lifecycle

Pitfalls:
- Typically used to clean up code
- Should think about API design
- It typically shouldn't utilize inheritance for flat problem/structure
- The "Singleton" of Structural Patterns

Comparison with Adapter Pattern:
- Simplifies interface
- Works with composites
- Cleaner API

Summary:
- Simplifies Client Interface
- Easy pattern to implement
- Refactoring pattern