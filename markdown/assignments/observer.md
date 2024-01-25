# Assignment: Weather station simulator

**Goal:**

Your goal is to design and implement a system in Java that consists of a weather station and weather observers. As the temperature changes, the observers should be notified immediately. Use the Observer design pattern to implement this system.

**Guidelines:**

- Design the weather station to run in its own thread. This means it will continuously update its data and notify observers after each update.
- The weather station should be able to register and remove observers and notify them when there is a change in temperature.
- Each observer should be able to display a unique message when notified, including the current temperature.
- The constructor of the weather station should set an initial random temperature.
- The weather station's thread should run an eternal loop that periodically updates the temperature by a small increment or decrement (e.g., +/- 1 degree) to simulate changes in weather conditions. Set a random time interval between updates (e.g., 1-5 seconds). There should be maximum and minimum temperature values that the weather station cannot exceed. 
- Write a `main()` method that creates a weather station and several observers. The `main()` method should not explicitly set the weather; instead, it should start the weather station thread, register observers, and let the simulation run for a certain period. After that, it should remove one of the observers and let the simulation continue. The output should demonstrate that the removed observer is no longer notified of weather changes.
