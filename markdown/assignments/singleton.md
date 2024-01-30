# Assignment: Logger System

**Goal:**

Your goal is to design and implement a Logger system in Java using the Singleton design pattern. The Logger system should allow writing log messages to a file.

**Guidelines:**

- Implement the `Logger` class as a Singleton.
- The `Logger` class should provide methods for writing log messages to a file. Each log message should be written on a new line in the file.
- The constructor of the `Logger` class should initialize the logger with a default file name.
- Provide a method in the `Logger` class to set the file name dynamically. This method should close the current file and open a new file with the specified name.
- Ensure that the `Logger` class handles file I/O operations safely and gracefully. Thus, add the necessary `try-catch` blocks to handle exceptions.

**Example Usage:**

```java
public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.setFileName("new_log.txt"); // Change file name
        logger.write("Simulation started");
        logger.write("Processing data...");
        logger.write("Simulation finished");
        logger.close(); // Remember to close the logger
    }
}
```

> In a real application, the logger would be used in multiple places, which is why it is important to ensure that only one instance of the logger exists - just as is done in this assignment. Otherwise, many log files might be created, which would make it difficult to analyze the log messages, or, worse still, there might be many attempts to open the same file for writing, which would result in an exception.



