Chain of Responsibility Pattern
- decouples a request from a handling object in a chain of handlers until it is finally recognized

Concepts:
- Decoupling of sender and receiver
- Receiver contains reference to next receiver
- Promotes loose coupling

Examples:
- java.util.logging.Logger#log()
- javax.servlet.Filter#doFilter()
- Spring Security Filter Chain

Design:
- Chain of receiver objects
- Handler is interface based
- ConcreteHandler for each implementation
- Each handler has a reference to the next
- Handler, ConcreteHandler

Pitfalls:
- Handling/Handler guarantee
- Runtime configuration risk
- Chain length/performance issues
- Potential memory leak

Pattern Comparison:
- Handler is unique
- Successor
- Can utilize the Command pattern