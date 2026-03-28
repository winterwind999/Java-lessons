1. Can you iterate over elements stored in a Java HashMap?
   A: No, you cannot.
   B: Yes, but the order of the elements is undefined.
   C: Yes, and the elements are always sorted by the defined keys.

2. What is the best way to validate a telephone number in your application?
   A: Write your own parser.
   B: Use a regular expression and check if the result matches your string.
   C: Parse it as an integer.

3. What would be a good way of describing streams in Java 8?
   A: Streams are processing patterns that work on your data.
   B: Streams are data structures that store incoming data.
   C: Streams are APIs for streaming data in your web application (e.g. websockets, video).

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

5. Is the following assignment to a method parameter valid in Java?
   void method(int a) {
   ...
   a = 4;
   ...
   }
   A: No, it will produce a compiler error.
   B: Yes.
   C: No, it will cause a runtime exception.

6. What is the time complexity of appending an element to an ArrayList?
   A: Always $O(1)$.
   B: Always $O(n)$.
   C: Amortized $O(1)$.

7. What is the main purpose of buffered Input/Output streams?
   A: To increase performance, as most I/O operations are done in blocks, not individual bytes.
   B: To be able read/write the same file from many threads at once.
   C: It is a security measure against buffer overflows and denial-of-service attacks.

8. What is the visibility of a class without an access modifier?
   class Sample {
   ...
   }
   A: It is the same as public.
   B: It is public if it has the same name as a source file, otherwise it is the same as private.
   C: It is visible within the same package.

9. What is the JAR file format?
   A: It is a Java bytecode format.
   B: It is a platform-specific package type that allows applications to be launched.
   C: It is a package built on the ZIP format, aggregating Java class files, metadata and resources.

10. What is an anonymous class?
    A: It is a private class inside another class. It can only be used within that class.
    B: It is a way of writing more reusable code by allowing a class to take different names depending on context.
    C: It is a way to declare a class and instantiate an object at the same time without giving the class a name.