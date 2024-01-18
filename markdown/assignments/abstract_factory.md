# Assignment: ASCII art user interfaces

**Goal:**

The goal is to implement a simple ASCII art-based user interface element creation factory using the Abstract Factory design pattern in Java.

**Requirements:**

1. Create an abstract class `UIElement` representing a general user interface element. This class should include an attribute `text` and an abstract method `display`.
2. Define concrete classes `Button`, `TextField`, and `Checkbox` that extend the `UIElement` class. Each class should implement the `display` method using ASCII art.
3. Create an abstract factory class `UIFactory` that defines methods for creating different user interface elements. Each method should take a parameter `text`.
4. Implement concrete factory classes `ButtonFactory`, `TextFieldFactory`, and `CheckboxFactory` that extend the `UIFactory` class and implement methods for creating user interface elements.
5. Create an application class `UIApplication` with a `main` method.
6. In the `UIApplication` class, use the `UIFactory` classes to create user interface elements and print them to the console.

**Guidelines:**

1. Use simple ASCII art for representation, such as outlining the boundaries of a button or text field.
2. Utilize an abstract factory class and its concrete implementations to ensure consistent creation of different user interface elements.
3. Focus on the principles of the Abstract Factory design pattern without excessive decoration.

Finally, add the ability to dynamically change the content of user interface elements by implementing a `setText` method in the `UIElement` class and providing the implementation in each concrete user interface element class.


