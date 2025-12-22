Observer Pattern
- decoupling pattern when we have subject that needs to be observed by one or more observers

Concepts:
- One-to-many observers
- Decoupled
- Event Handling
- Pub/Sub
- MVC

Examples:
- java.util.Observer
- java.util.EventListener
- javax.jms.Topic

Design:
- Subject that needs to be observed
- Observer is interface based
- Observable interface the subject can implement
- Concrete Observers are views in an event-driven application
- Subject, Concrete Subject, Observer, Concrete Observer

Pitfalls:
- Unexpected updates
- Large sized consequences
- Not knowing what has changed
- Debugging difficult

Comparison to Mediator Pattern:
- One-to-Many
- Decoupled
- Pub/Sub Broadcast Communication