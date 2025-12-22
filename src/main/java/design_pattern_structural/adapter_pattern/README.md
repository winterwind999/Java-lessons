Adapter Pattern
- pattern for connecting new code to legacy code 
- without having to change the working contract 
- that was produced from the legacy code originally

Concepts:
- Plug Adapter
- Client talk to an existing interface
- Legacy app that don't want to or can't possibly change
- Translating requests from the client to the code that we are adapting to
- Client, Adapter, Adaptee

Design:
- Client centric
- Adapt or integrate new with legacy components
- Interface, but not required
- Adaptee can be implementation
- Sometimes implemented to adapt to only one class

Examples:
- Arrays -> Lists
- Streams

Pitfalls:
- Not a lot
- Don't complicate
- Multiple Adapters
- Don't add functionality

Comparison with Bridge Pattern:
- Works after code is designed basically dealing with legacy code
- Retrofitted to make unrelated classes together
- Provides interface to legacy code to what it originally intended

Summary:
- Simple solution
- Easy to implement
- Integrate with Legacy
- Can provide multiple adapters