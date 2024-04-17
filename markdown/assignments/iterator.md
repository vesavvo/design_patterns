# Assignment: Fibonacci Sequence Generator

**Goal:**

Your task is to design and implement a Fibonacci sequence generator using the Iterator design pattern in Java. This exercise will help you understand how to apply the Iterator pattern to provide a simple way to access a sequential, computed series without exposing its underlying representation.

>In this assignment, we will focus on applying the Iterator design pattern. While we are accustomed to using iterators with concrete collections, in this exercise, the Fibonacci sequence acts as a "pseudo-collection." This design will challenge you to think about iterators beyond simple collections and apply them to dynamically computed sequences. Our goal is to understand how the Iterator pattern can be used to abstract the iteration logic from the data generation logic, which is particularly useful for sequences where elements are computed on the fly.

**Guidelines:**

You will create three classes and an interface to manage the generation and iteration of the Fibonacci sequence:
1. **Aggregate Interface**: An interface that declares a method for creating an iterator. It should declare a method `iterator()` that returns an instance of `Iterator<Integer>`.
2. **FibonacciAggregate Class**: This class will implement the Aggregate interface and will be responsible for generating Fibonacci numbers. It does not have to store the numbers but generate them on demand. This class should have a method to generate the next Fibonacci number when requested by the iterator.
3. **FibonacciIterator Class**: This class will implement the `java.util.Iterator<Integer>` interface. It should handle the logic for iterating over the Fibonacci sequence.
4. **Main Class**: A simple class to demonstrate the functionality of your Fibonacci sequence generator. In your `Main` class, demonstrate the use of the Fibonacci sequence generator by iterating through and printing the first 10 Fibonacci numbers.

Your Fibonacci sequence generator should be capable of producing a set number of elements (e.g., the first 10 numbers) or potentially generating an infinite sequence, limited only by system capabilities or a specified stop condition managed by the client code.
