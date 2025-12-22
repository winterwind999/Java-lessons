Visitor Pattern
- separate an algorithm from an object structure

Concepts:
- Separate algorithm from object
- Adding new features
- Maintain Open/Closed principle
- Visitor changes

Design:
- Interface based
- Design around the visitor from the beginning
- Visitor and Element
- Elements have visit method
- Visitors knows every Element
- Visitor, ConcreteVisitor, Element, ConcreteElement

Pitfalls:
- Plan for adaptability upfront
- Indirection somewhat confusing
- Each visitor may also not implement all the methods so you may want to implement Adapter Pattern

Comparison with Iterator:
- Interface based
- Adaptability through externalized changes
- Multiple visitors

Summary:
- Use this pattern when expecting changes in application but don't know them upfront
- Adds minor complexity
- Externalizes changes