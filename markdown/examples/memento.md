# Memento

> A behavioral pattern

## Example: [GUI state](../../src/main/java/memento/guistate)

![scr_guistates.png](..%2Fimg%2Fscr_guistates.png)


This simple applications follow the MVC pattern:
- The [`Gui`](../../src/main/java/memento/guistate/Gui.java) class is the graphical user interface that contains three colored rectangles and one checkbox. By clicking on the rectangles, the user can change their color. The colors follow a sequence: red, blue, yellow, and back to red. The colored boxes are implemented in the [`ColorBox`](../../src/main/java/memento/guistate/ColorBox.java) class.
- The [`Controller`](../../src/main/java/memento/guistate/Controller.java) class handles the communication between the model and the view. The controller reacts to the user's actions and updates the model accordingly. When necessary, the controller updates the view to reflect the changes in the model.
- The [`Model`](../../src/main/java/memento/guistate/Model.java) class contains the application's state. It stores the colors of the rectangles and the state of the checkbox. For each colored box, the value is stored as 0, 1, or 2, and the state of the checkbox is stored as true or false.

The application uses the Memento pattern to save and restore the state of the model. The [`Model`](../../src/main/java/memento/guistate/Model.java) class has a `createMemento()` method that returns a [`Memento`](../../src/main/java/memento/guistate/Memento.java) object.

The memento object contains the state of the model at the time of its creation. The [`Model`](../../src/main/java/memento/guistate/Model.java) class also has a `restoreState()` method that takes a memento object and restores the state of the model to the state saved in the memento, after which it updates the view to reflect the changes in the model.

> Note: Alternatively, you could use the Observer pattern in conjunction with the Memento pattern to notify the view when the model's state changes. This would allow the view to update itself without the controller having to explicitly tell it to do so.

The mementos are stored in an `ArrayList` in the [`Controller`](../../src/main/java/memento/guistate/Controller.java) class.

The [`Memento`](../../src/main/java/memento/guistate/Memento.java) class implements the empty [`IMemento`](../../src/main/java/memento/guistate/IMemento.java) interface. This is a common practice when the memento doesn't need to expose any of its data to the caretaker. If there were any metadata that the caretaker needed to access, the memento would expose it through the [`IMemento`](../../src/main/java/memento/guistate/IMemento.java) interface.

Following the terminology in the pattern, the [`Model`](../../src/main/java/memento/guistate/Model.java) class is the originator, the [`Memento`](../../src/main/java/memento/guistate/Memento.java) class is the memento, and the [`Controller`](../../src/main/java/memento/guistate/Controller.java) class is the caretaker.

The undo functionality is triggered by the user pressing the `Ctrl+Z` key combination.

> Note: This application does not limit the number of mementos that can be stored. In a real application, you may would want to limit the number of mementos to avoid using too much memory.

## See in the Internet

- Refactoring Guru: https://refactoring.guru/design-patterns/memento

- SourceMaking: https://sourcemaking.com/design_patterns/memento






