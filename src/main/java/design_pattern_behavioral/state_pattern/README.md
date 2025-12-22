State Pattern
- represent state in an application

Concepts:
- Localized state behavior
- Stat Object
- Separates What from Where
- OCP

Design:
- Abstract Class / Interface
- Each state is class based
- Context unaware
- Context, State, ConcreteState

Pitfalls:
- Know your states
- More classes
- Keep logic out of Context
- Identifying what triggers state change

Comparison to Strategy Pattern:
- Interface based
- State only knows state it can transition to
- Class per State