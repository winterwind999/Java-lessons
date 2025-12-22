Command Pattern
- lets you encapsulate each request as an object

Concepts:
- Encapsulate request as an object
- Object-oriented callback
- Maintainability is increased due to decouple sender from processor
- Often used for "undo" functionality

Examples:
- java.lang.Runnable
- javax.swing.Action

Design:
- Object per command
- Command interface
- Execute method
- "Unexecute" method
- Command, Invoker, ConcreteCommand

Pitfalls:
- Dependence on other patterns
- Multiple Commands
- Make use of Memento
- Prototype for copies

Pattern Comparison:
- Object per command
- Class contains the 'what'
- Encapsulates action