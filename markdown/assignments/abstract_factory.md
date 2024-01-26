# Assignment: ASCII art user interfaces

**Goal:**

The goal is to implement a simple ASCII art-based user interface element creation factory using the Abstract Factory design pattern in Java. Your application should implement at least two different 'look-and-feel' styles for your user interface elements.

**Requirements:**

1. Define abstract classes `Button`, `TextField`, and `Checkbox` that declare an abstract `display`method.
2. Implement concrete classes `ButtonA`, `TextFieldA`, and `CheckboxA` that extend the abstract classes and implement the `display()` method using one style.
3. Implement concrete classes `ButtonB`, `TextFieldB`, and `CheckboxB` that extend the abstract classes and implement the `display()` method using a different style.
4. Define an abstract factory class `UIFactory` that defines methods for creating different user interface elements. Each method should take a parameter `text`.
5. Implement concrete factory classes `AFactory`, and `BFactory` that extend the `UIFactory` class and implement methods for creating user interface elements. A factory class should create elements of one style only. Each creation method should take a `String` parameter `text` and return a user interface element of the appropriate type, showing the text in the element.
5. Add a `main` method to your application that creates a `UIFactory` object and uses it to create user interface elements of the chosen style.
6. Finally, add the ability to dynamically change the content of an existing user interface element by implementing a `setText()` method. The change should be visible when the `display()` method is next called. At this point, reconsider your class hierarchy: as the method is common to all user interface elements, where should it be defined? How should it be implemented?

**Guidelines:**

1. Use simple ASCII art for representation, such as outlining the boundaries of a button or text field.
2. You can rename the classes and methods to better suit your application.
2. Utilize an abstract factory class and its concrete implementations to ensure consistent creation of different user interface elements.
3. Focus on the principles of the Abstract Factory design pattern without excessive decoration.



