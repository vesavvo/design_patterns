# Singleton

> A creational pattern

## Example: [Shared timer](../../src/main/java/singleton/timer)

The application in the [`Gui`](../../src/main/java/singleton/timer/Gui.java) class opens three windows, each with a label that displays the elapsed time in seconds, as well as two buttons, one for resetting the timer and another for refreshing the elapsed time.

The [`Timer`](../../src/main/java/singleton/timer/Timer.java) class is a singleton, which means that only one instance of it can exist at any given time.

The timer is called to reset at the beginning of the `start` method. At that point, the timer instance is created, as the `getInstance` method is called for the first time.

At subsequent calls to the `getInstance` method, the same timer instance is returned. This happens whenever the user clicks the `reset` or `display` button in any of the windows.

The methods in the `Timer` class are synchronized, so that only one thread can access them at a time. In this example, this is not strictly necessary, as the methods are only called from the same event dispatch thread.


