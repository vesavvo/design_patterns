# Assignment: Calendar Adapter

**Goal:**

Develop a Java adapter that interfaces the `java.util.Calendar` class with a new interface, `NewDateInterface`, which defines methods for setting and getting the day, month, and year. Additionally, include a method `advanceDays()` in the interface that advances the date by a given number of days.

That interface is the one that the client code is going to use, and your adapter class should implement it, and make use of the `Calendar` class internally.

**Guidelines:**

1. **Implement `NewDateInterface`**: Define the interface with the following methods:
    - `void setDay(int day)`
    - `void setMonth(int month)`
    - `void setYear(int year)`
    - `int getDay()`
    - `int getMonth()`
    - `int getYear()`
    - `void advanceDays(int days)`

2. **Create `CalendarToNewDateAdapter`**: This class will implement `NewDateInterface`, using a `Calendar` instance internally to handle date operations.

3. **Test the Adapter**: In the `Main` class that acts as the client code, demonstrate the functionality of the adapter by creating an instance of `CalendarToNewDateAdapter`, setting the date, advancing the date with several days, and printing the new date.

