# Assignment: Algorithm Performance Comparison

**Goal:**

Your goal is to implement at least three sorting algorithms using the Strategy pattern, and empirically compare their performance with two different data sets.

**Guidelines:**

The following website lists several frequently used sorting algorithms: https://www.geeksforgeeks.org/sorting-algorithms/ as well as their Java implementations. Take a look at them and pick three that you find fascinating.

Design an application that follows the Strategy pattern. In your application, each of the three chosen algorithms should act as one of the strategies. The application should be able to sort an array of integers using any of the three strategies.

In this assignment, you have the permission to take advantage of the Java source codes provided at the website. If you do so, please add a clear reference to the source code in your application as a comment, and make sure to understand the code you are using up to the point that you can explain it to someone else. Pay attention to correctly modifying the code to fit your application's design (Strategy pattern).

For testing the performance of the three sorting algorithms, create programmatically (with the aid of the random number generator) two data sets:
- A small array of integers (e.g., 30 elements)
- A large array of integers (e.g., 100,000 elements).

For each data set, sort it using each of the three strategies. Have your application measure and output the time it takes for each sorting algorithm to complete the task using each algorithm. If you find the given data set sizes (30 and 100,000) too small or too large, feel free to adjust them.

> Note: do not use `java.util.Arrays.sort()` or any other built-in sorting algorithm in your application.

