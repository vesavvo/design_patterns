# Singleton

> A creational pattern

## Example: [Shared timer](../../src/main/java/singleton/timer)

The application in the [`Gui`](../../src/main/java/singleton/timer/Gui.java) class opens three windows, each with a label that displays the elapsed time in seconds, as well as two buttons, one for resetting the timer and another for refreshing the elapsed time.

The [`Timer`](../../src/main/java/singleton/timer/Timer.java) class is a singleton, which means that only one instance of it can exist at any given time.

The timer is called to reset at the beginning of the `start` method. At that point, the timer instance is created, as the `getInstance` method is called for the first time.

At subsequent calls to the `getInstance` method, the same timer instance is returned. This happens whenever the user clicks the `reset` or `display` button in any of the windows.

The methods in the `Timer` class are synchronized, so that only one thread can access them at a time. In this example, this is not strictly necessary, as the methods are only called from the same event dispatch thread.

## Example: [Connection pool](../../src/main/java/singleton/connectionpool)

In the example, the [`ConnectionPool`](../../src/main/java/singleton/connectionpool/DatabaseConnectionPool.java) class is used to create a pool of database connections.

Each database connection is represented by an instance of the [`Connection`](../../src/main/java/singleton/connectionpool/Connection.java) class. The `ConnectionPool` class is a singleton, which means that only one instance of it can exist at any given time.

There is a pool of 10 connections, which are created when the `ConnectionPool` class is created. The `getConnection` method returns a connection from the pool. Once the client is done with the connection, it is returned to the pool by calling the `releaseConnection` method.

The Singleton pattern ensures that only one instance of the `ConnectionPool` class exists at any given time. This is important, as the pool of connections is a shared resource, which may be accessed by multiple threads.



## See in the Internet

- Refactoring Guru: https://refactoring.guru/design-patterns/singleton

- SourceMaking: https://sourcemaking.com/design_patterns/singleton






