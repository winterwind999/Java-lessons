1. Can a single class in Java inherit from more than one other class or implement more than one interface?
   A: Yes, a class can inherit from multiple classes and implement many interfaces at the same time.
   B: No, a class can implement many interfaces, but can inherit from at most one class.
   C: No, a class can only implement one interface and inherit from one parent.

2. For how long will an object take up memory?
   A: Until the moment when the garbage collector cleans it.
   B: As soon as you release all references to the object, its memory will be freed.
   C: Until the moment you delete the object.

3. What is the motivation for using generics in Java (e.g. class MyClass<Type>)?
   A: To write more reusable and type-safe code that can take a type as a parameter.
   B: It is primarily for reasons relating to performance optimization.
   C: It is an alternative to inheritance, but sometimes much cleaner.

4. What would the following code output?
   System.out.println(String.format("id = %08.2f", 423.147));
   A: id = 00000423.15
   B: It will throw an exception.
   C: id = 00423.15

5. Which of following sentences is not true about Java Streams (8)?
   A: One stream can be reused and visited many times.
   B: The streams can be of infinite size and, because of laziness, they can short-circuit a lot of operations.
   C: They can be parallelized easily.

6. How can you break out of a for loop inside a nested loop?
   for (int i = 0; i < 10; i++) {
   while (j < 100) {
   ...
   // break;
   ...
   }
   }
   A: It is not possible with break. Instead, you need to refactor your code (e.g. use a separate method).
   B: Assign a label, "outerLoop: for (... " and then break outerLoop;
   C: Use return instead.

7. Can you modify the object set? final Set<String> set = new HashSet<>(Arrays.asList("first", "second"));
   A: The set is immutable; it cannot be modified in any way.
   B: You cannot add or remove elements to or from a set, but you can reassign a different object as the set variable.
   C: You can add and remove elements to and from a set, but you cannot reassign a different object to the set.

8. Should you use a thread pool or just create a new thread whenever you need it?
   A: Thread pools require less overhead for creating/destroying a thread, as they can be reused.
   Having a limited number of threads in the thread pool can prevent overuse of memory, but if there are too few threads,
   it may lead to poor resource utilization or even starvation.
   B: It is always better to create a new thread. Thread pools are a legacy feature relating to historical hardware and resource limitations.
   C: There is no practical difference, as a modern Java Virtual Machine will optimize both approaches to yield the same result.

9. Why does Java use I/O streams for reading files from disks rather than just using byte arrays?
   A: It is an old, legacy API.
   B: I/O streams are an object-oriented way of implementing byte arrays.
   C: Files may potentially be very large and may not fit into memory. You can also process files byte by byte while you are reading them.

10. Who can access the class member with a private modifier?
    A: You can access it only within the same file.
    B: You can access it only within the same class. However, you can access different objects' private members (e.g. in a copy constructor).
    C: You can access it only within same object.
