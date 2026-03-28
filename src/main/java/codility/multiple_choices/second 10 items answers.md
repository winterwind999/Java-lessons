1. Can you iterate over elements stored in a Java HashMap?
A: No, you cannot.
B: Yes, but the order of the elements is undefined.
C: Yes, and the elements are always sorted by the defined keys.

Correct Answer: B ✅
Why: A HashMap does not guarantee any specific order for its elements. While you can iterate through it using methods like entrySet(), keySet(), or values(), 
the order may even change over time as more elements are added.

2. What is the best way to validate a telephone number in your application?
A: Write your own parser.
B: Use a regular expression and check if the result matches your string.
C: Parse it as an integer.

Correct Answer: B ✅
Why: Regular expressions (regex) are the standard industry tool for pattern matching. 
They allow you to define complex rules for digit counts, country codes, and formatting (like dashes or parentheses) 
far more efficiently than a custom parser or an integer conversion.

3. What would be a good way of describing streams in Java 8?
A: Streams are processing patterns that work on your data.
B: Streams are data structures that store incoming data.
C: Streams are APIs for streaming data in your web application (e.g. websockets, video).

Correct Answer: A ✅
Why: Unlike a Collection, a Java 8 Stream is not a data structure that stores elements. 
Instead, it is a functional pipeline that carries elements from a source through various computational steps (like filter or map).

4. What would this program output? 
String value = "red"; 
switch (value) { 
    case "red": 
        System.out.println("FAIL"); 
    case "green": 
        System.out.println("OK"); 
}
A: FAIL OK
B: FAIL
C: It would not compile, as you cannot use switch with strings.

Correct Answer: A ✅
Why: Because there is no break statement after the first case, the code "falls through" and executes every subsequent 
line within the switch block until it ends or hits a break. (Note: Since Java 7, using switch with Strings is perfectly valid).

5. Is the following assignment to a method parameter valid in Java? 
void method(int a) {
    ... 
    a = 4;
    ... 
}
A: No, it will produce a compiler error.
B: Yes.
C: No, it will cause a runtime exception.

Correct Answer: B ✅
You can reassign a parameter's value inside a method, though it only changes the local copy of that value (Java is pass-by-value).

6. What is the time complexity of appending an element to an ArrayList?
A: Always $O(1)$.
B: Always $O(n)$.
C: Amortized $O(1)$.

Correct Answer: C ✅
Why: Most appends are $O(1)$ because there is space in the underlying array. However, when the array is full, 
Java must create a new, larger array and copy all $n$ elements over ($O(n)$). When averaged out over many operations, this results in Amortized $O(1)$.

7. What is the main purpose of buffered Input/Output streams?
A: To increase performance, as most I/O operations are done in blocks, not individual bytes.
B: To be able read/write the same file from many threads at once.
C: It is a security measure against buffer overflows and denial-of-service attacks.

Correct Answer: A ✅
Why: Accessing a disk or network for every single byte is extremely slow. 
Buffered streams read or write a large block of data into memory at once, reducing the number of expensive system calls.

8. What is the visibility of a class without an access modifier?
class Sample {
...
}
A: It is the same as public.
B: It is public if it has the same name as a source file, otherwise it is the same as private.
C: It is visible within the same package.

Correct Answer: C ✅
Why: This is known as package-private (or default) access. The class is visible to all other classes in the same package, but hidden from classes in different packages.

9. What is the JAR file format?
A: It is a Java bytecode format.
B: It is a platform-specific package type that allows applications to be launched.
C: It is a package built on the ZIP format, aggregating Java class files, metadata and resources.

Correct Answer: C ✅

10. What is an anonymous class?
A: It is a private class inside another class. It can only be used within that class.
B: It is a way of writing more reusable code by allowing a class to take different names depending on context.
C: It is a way to declare a class and instantiate an object at the same time without giving the class a name.

Correct Answer: C ✅
