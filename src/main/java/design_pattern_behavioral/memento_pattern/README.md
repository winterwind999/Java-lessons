Memento Pattern
- externalize an object state usually to provide rollback functionality

Concepts:
- Restore Objects to previous state
- Externalize internal state
- Undo/Rollback
- Shields complex internals

Examples:
- java.util.Data
- java.io.Serializable

Design:
- Class based
- Originator
- Caretaker
- Memento
- Magic Cookie

Pitfalls:
- Can be expensive for large copy of originator data
- Deletes / history
- Careful of exposing information

Comparison to Command Pattern:
- State captured
- Independent state
- Caretaker / History

Summary:
- All about capturing state
- Can get heavy with history
- Recreate state