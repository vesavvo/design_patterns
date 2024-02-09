# Assignment: Customizable Printer

**Goal:**

In this assignment, you start by implementing a `Printer` class in Java that provides basic functionality to print a message to the console.

Then, the objective is to extend this functionality using the Decorator design pattern.

**Guidelines:**

In your solution, the `BasicPrinter` class should be the base class that provides the basic functionality to print a message to the console. The `Printer` class should also have a `print()` method that prints the given message to the console.

Add at least the following two decorators to your solution:
- `FilePrinter`: This decorator should print the message to a file instead of the console. Yuo can use a hardcoded file name.
- `EncryptedPrinter`: This decorator should encrypt the message before printing it to the console. You can use any encryption algorithm you want as long as the message is decryptable.

As a result of implementing the decorators, the code of the following structure should work:

```java
Printer printer = new BasicPrinter();
printer.print("Hello World!");

Printer printer2 = new EncryptedPrinter(new FilePrinter(new BasicPrinter());
printer2.print("Hello World!");

```



