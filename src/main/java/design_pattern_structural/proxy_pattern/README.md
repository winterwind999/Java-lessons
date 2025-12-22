Proxy Pattern
- acts as an interface to something else
- it's often confused with just being a very simple pattern
- usually used with an interceptor to interact between two objects

Concepts:
- Interface to an object by wrapping with a class to create that proxy
- Can add functionality to that wrapped object
- solves Security, Simplicity, Remote, Expensive Object to create
- Proxy called to access real object

Examples:
- java.lang.reflect.Proxy
- java.rmi.*

Design:
- Interface based
- Interface and Implementation Class
- java.lang.reflect.InvocationHandler
- java.lang.reflect.Proxy
- Client, Interface, InvocationHandler, Proxy, Implementation

Pitfalls:
- Only one proxy
- Another Abstraction
- Similar to other patterns

Comparison with Decorator Pattern:
- Can add functionality, but not its main purpose
- Can only have one
- Compile time

Summary:
- Great utilities built into Java API
- Only one instance
- Used by DIJ/IoC Frameworks