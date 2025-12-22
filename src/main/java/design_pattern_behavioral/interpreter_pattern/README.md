Interpreter Pattern
- use to represent the grammar of a language
- parsing aspects of grammar

Concepts:
- Represent grammar
- Interpret a sentence
- Map a domain
- Abstract Syntax Tree (AST)

Examples:
- java.util.Pattern
- java.text.Format

Design:
- AbstractExpression
- Interpret
- TerminalExpression
- NonterminalExpression

Pitfalls:
- Complexity
- Class per rule
- Use of other patterns
- Adding a new variant changes every variant
- Specific case

Pattern Comparison:
- Access to properties
- Functions as methods